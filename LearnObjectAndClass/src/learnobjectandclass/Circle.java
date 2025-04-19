package learnobjectandclass;

public class Circle {

    double redious;

    public Circle() {
    }

    public Circle(double redious) {
        this.redious = redious;
    }

    public double getArea() {

        double area = Math.PI * Math.pow(redious, 2);
        return area;
    }

    public double getParimeter() {

        double parimeter = 2 * Math.PI * redious;
        return parimeter;
    }

    public void setRedious(double newRedious) {

        redious = newRedious;

    }

}
