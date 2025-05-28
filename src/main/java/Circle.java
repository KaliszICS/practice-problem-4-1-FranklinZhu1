public class Circle {
    
    private double radius;
    final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double area() {
        return this.PI*this.radius*this.radius;
    }

    public double circumference() {
        return 2*this.PI*this.radius;
    }

}
