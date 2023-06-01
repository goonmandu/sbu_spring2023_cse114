public class Main {
    public static void main(String[] args) {
        var squares = new GeometricObject[10];
        var circles = new GeometricObject[10];
        for (int i = 0; i < 10; ++i) {
            squares[i] = new Square(i + 1);
        }
        for (int i = 0; i < 10; ++i) {
            circles[i] = new Circle(0, 0, i + 1);
        }

        Square sqMax = (Square) squares[0];
        Circle circMax = (Circle) circles[0];
        for (int i = 0; i < squares.length - 1; ++i) {
            sqMax = (Square) GeometricObject.max(squares[i], squares[i+1]);
        }
        for (int i = 0; i < circles.length - 1; ++i) {
            circMax = (Circle) GeometricObject.max(circles[i], circles[i+1]);
        }
        System.out.printf("sqMax = %s\n\ncircMax = %s\n", sqMax, circMax);

        Square squareClone = (Square) ((Square) squares[0]).clone();
        Circle circleClone = (Circle) ((Circle) circles[0]).clone();
        System.out.printf("\n\nAre squares[0] and squareClone the same object? %b\n", squares[0] == squareClone);
        System.out.printf("Are circles[0] and circleClone the same object? %b\n", circles[0] == circleClone);
        System.out.printf("Are squares[0] and squareClone the same practically? %b\n", ((Square) squares[0]).equals(squareClone));
        System.out.printf("Are circles[0] and circleClone the same practically? %b\n", ((Circle) circles[0]).equals(circleClone));
    }
}
