package assignment_18_sept_2025;



public class Square {
    private final double side;
    public Square(double side) {
        this.side = side;
    }
    public double calculatePerimeter() {
        return  side * 4;
    }
    public double calculateArea() {
        return side * side;
    }
}
