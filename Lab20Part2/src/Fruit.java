public class Fruit extends Food {
    private Season season;

    public String getSeason() { return season.toString(); }
    public void setSeason(Season newSeason) {
        this.season = newSeason;
    }

    public int caloriesInServings(int servings) {
        return servings * caloriesPerServing;
    }

    public boolean equals(Food rhs) {
        return this.getClass() == rhs.getClass()
                && this.description.equals(rhs.description)
                && this.caloriesPerServing == rhs.caloriesPerServing
                && this.season == ((Fruit) rhs).season;
    }

    public String toString() {
        return String.format("%s, Season: %s", super.toString(), season.toString());
    }

    public Fruit(String description, int caloriesPerServing, Season season) {
        super(description, caloriesPerServing);
        this.season = season;
    }
}
