
package midlevelquestion6;

public class Ractangle extends Shape{
    
    private double hieght;
    private double widght;

    public Ractangle() {
    }

    public Ractangle(double hieght, double widght) {
        this.hieght = hieght;
        this.widght = widght;
    }

    public double getHieght() {
        return hieght;
    }

    public void setHieght(double hieght) {
        this.hieght = hieght;
    }

    public double getWidght() {
        return widght;
    }

    public void setWidght(double widght) {
        this.widght = widght;
    }
    

    @Override
    public double area() {
        
        return hieght*widght;
    }
    
    
    
}
