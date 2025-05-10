
package midlevelquestion6;


public class Triangle extends Shape{
    
    protected double floor;
    protected double hieght;

    public Triangle() {
    }

    public Triangle(double floor, double hieght) {
        this.floor = floor;
        this.hieght = hieght;
    }

    public double getFloor() {
        return floor;
    }

    public void setFloor(double floor) {
        this.floor = floor;
    }

    public double getHieght() {
        return hieght;
    }

    public void setHieght(double hieght) {
        this.hieght = hieght;
    }

    @Override
    public double area() {
        
        return ((1/2)*floor*hieght);
    }
    
    
    
}
