package domaci;

public class Triangle extends Shape{
        private double a, b, c;

        public Triangle(String triangle, double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        /*Constructor*/

        /*Methods*/
        //Todo:

    @Override
    public double circumference() {
        return a + b + c;
    }

    @Override
    public double area() {
        if ((a+b)>c && (a+c)>b && (b+c)>a) {
            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            return area;
        }
    }

    @Override
        public String toString() {
            return "Square{}";
        }
    }

