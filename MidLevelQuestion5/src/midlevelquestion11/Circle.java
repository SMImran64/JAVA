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
    public void area() {

        System.out.println("\n The Area of Circle: "+(Math.PI*Math.pow(redious, 2)));
    }

    

   

    @Override
    public String toString() {
        return "Circle{" + "redious=" + redious + '}';
    }

}
