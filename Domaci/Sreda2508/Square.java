package domaci;

public class Square extends Shape {
    private int a;

    public Square(int a) {
        this.a = a;
    }

    public Square(String square, int i, int i1) {
        super();
    }

    /*Constructor*/

    /*Methods*/
    //TODO



    public double circumference() {
        return 4*a;
    }

    public double area() {
        return a*a;
    }

    public String toString() {
        return "Square{}";
    }
}
