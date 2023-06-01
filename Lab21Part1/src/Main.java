public class Main {
    public static void main(String[] args) {
        var geometricObjects = new GeometricObject[5];
        for (int i = 0; i < geometricObjects.length; ++i) {
            if (i % 2 == 1) {
                geometricObjects[i] = new Square(Math.pow(i+1, 2));
            } else {
                geometricObjects[i] = new Triangle(i+1, i+1.5, i+2);
            }
        }
        for (var go : geometricObjects) {
            System.out.println(go);
            if (go instanceof Colorable) {
                ((Colorable) go).howToColor();
            }
            System.out.println("\n");
        }
    }
}
