package midlevelquestion11;

public class Rectangular extends Shape {

    private double height;
    private double weight;

    public Rectangular() {
    }

    public Rectangular(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void area() {

        System.out.println("\n The Area of Retangular: "+(height * weight));

    }

    

    @Override
    public String toString() {
        return "Rectangular{" + "height=" + height + ", weight=" + weight + '}';
    }

}
