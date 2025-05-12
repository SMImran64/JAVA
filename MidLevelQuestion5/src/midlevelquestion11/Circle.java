package midlevelquestion11;

public class Circle extends Shape {

    private double redious;

    public Circle() {
    }

    public Circle(double redious) {
        this.redious = redious;
    }

    public double getRedious() {
        return redious;
    }

    public void setRedious(double redious) {
        this.redious = redious;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(redious, 2);
    }

    @Override
    public String toString() {
        return "Circle{" + "redious=" + redious + '}';
    }

}
