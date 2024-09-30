package calculations;

public class CustomNumber {

    private double a;
    private double b;

    public CustomNumber(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Number{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
