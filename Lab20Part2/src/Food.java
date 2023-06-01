public abstract class Food {
    protected String description;
    protected int caloriesPerServing;

    public String getDescription() { return description; }
    public int getCaloriesPerServing() { return caloriesPerServing; }
    public void setDescription(String newDescription) {
        this.description = newDescription;
    }
    public void setCaloriesPerServing(int newCalsPerServ) {
        this.caloriesPerServing = newCalsPerServ;
    }

    public abstract int caloriesInServings(int servings);
    public abstract boolean equals(Food rhs);

    @Override
    public String toString() {
        return String.format("%s: %d Cal/serv",
                description, caloriesPerServing);
    }

    protected Food(String description, int caloriesPerServing) {
        this.description = description;
        this.caloriesPerServing = caloriesPerServing;
    }

    public static void main(String[] args) {
        LiquidFood sprite = new LiquidFood("Sprite", 192, 1.32);
        LiquidFood water = new LiquidFood("Water", 0, 1);
        Fruit mango = new Fruit("Mango", 70, Season.SUMMER);
        Fruit rambutan = new Fruit("Rambutan", 75, Season.WINTER);

        System.out.println(sprite);
        System.out.println(water);
        System.out.println(mango);
        System.out.println(rambutan);

        // Does Sprite equal water?
        System.out.printf("\nDoes Sprite equal water?\n%b\n\n",
                sprite.equals(water));

        // Does the same Sprite, magically transformed into water, equal water?
        sprite.setDescription("Water");
        sprite.setCaloriesPerServing(0);  // god i wish this were real
        sprite.setViscosity(1);
        System.out.printf("Does Sprite, magically transformed into water, equal water?\n%b\n\n",
                sprite.equals(water));

        // Does a rambutan equal a mango?
        System.out.printf("Does a rambutan equal a mango?\n%b\n\n",
                rambutan.equals(mango));

        // What if the rambutan were to magically become a mango?
        rambutan.setDescription("Mango");
        rambutan.setCaloriesPerServing(70);
        rambutan.setSeason(Season.SUMMER);
        System.out.printf("Does the same rambutan, magically transformed into a mango, equal a mango?\n%b\n\n",
                rambutan.equals(mango));

        // Does water equal a mango?
        System.out.printf("Does water equal a mango?\n%b\n",
                water.equals(mango));
    }
}
