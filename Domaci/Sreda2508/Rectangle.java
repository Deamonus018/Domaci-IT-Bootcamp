package domaci;

public class Rectangle extends Shape {
    private double a, b;

    public Rectangle(String rect, double a, double b) {
        this.a = a;
        this.b = b;
    }
    /*Constructor*/

    /*Methods*/

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double circumference() {
        return 2*(a+b);
    }

    //Shape: {name}
    //Circumference: {circumference()}
    //Area: {area()}
    //-----------------
    @Override
    public String toString() {
        return super.toString();
    }
}
