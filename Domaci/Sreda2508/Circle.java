package domaci;

public class Circle extends Shape {
    private double r;

    public Circle(String circ, double r) {
        this.r = r;
    }


    /*Constructor*/

    /*Methods*/
    //Todo:

    @Override
    public double circumference() {
        double circumference = Math.PI * 2 * r;
        return circumference;
    }

    @Override
    public double area() {
       double area = Math.PI * r * r;
       return area;
    }

    @Override
    public String toString() {
        return "";
    }
}
