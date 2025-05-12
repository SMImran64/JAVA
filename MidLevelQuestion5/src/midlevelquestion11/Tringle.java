package midlevelquestion11;

public class Tringle extends Shape {

    private double height;
    private double floor;

    public Tringle() {
    }

    public Tringle(double height, double floor) {
        this.height = height;
        this.floor = floor;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getFloor() {
        return floor;
    }

    public void setFloor(double floor) {
        this.floor = floor;
    }

    @Override
    public void area() {

        System.out.println("\n The Area of Trigle: "+(0.5 * height * floor));
    }

    

    @Override
    public String toString() {
        return "Tringle{" + "height=" + height + ", floor=" + floor + '}';
    }

}
