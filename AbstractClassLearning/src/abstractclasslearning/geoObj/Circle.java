
package abstractclasslearning.geoObj;

import abstractclasslearning.abs.Geomatric;
import java.util.Date;


public class Circle extends Geomatric{
    
    private double redius;

    public Circle() {
    }

    public Circle(double redius) {
        this.redius = redius;
    }

    public Circle(double redius, boolean filled, String color, Date dateCreated) {
        super(filled, color, dateCreated);
        this.redius = redius;
    }
    
    

    @Override
    public double getArea() {
        
        return Math.PI*Math.pow(redius, 2);
    }

    @Override
    public double getPerimeter() {
        
        return 2*Math.PI*redius;
    }

    public double getRedius() {
        return redius;
    }

    public void setRedius(double redius) {
        this.redius = redius;
    }
    
}
