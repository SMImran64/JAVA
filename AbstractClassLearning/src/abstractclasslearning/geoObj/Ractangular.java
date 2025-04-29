
package abstractclasslearning.geoObj;

import abstractclasslearning.abs.Geomatric;
import java.util.Date;


public class Ractangular extends Geomatric{
    
    private double hieght;
    private double weidth;

    public Ractangular() {
    }

    public Ractangular(double hieght, double weidth) {
        this.hieght = hieght;
        this.weidth = weidth;
    }

    public Ractangular(double hieght, double weidth, boolean filled, String color, Date dateCreated) {
        super(filled, color, dateCreated);
        this.hieght = hieght;
        this.weidth = weidth;
    }
    
    

    @Override
    public double getArea() {
        
        return hieght*weidth;
    }

    @Override
    public double getPerimeter() {
        
        return 2*(hieght+weidth);
    }

    public double getHieght() {
        return hieght;
    }

    public void setHieght(double hieght) {
        this.hieght = hieght;
    }

    public double getWeidth() {
        return weidth;
    }

    public void setWeidth(double weidth) {
        this.weidth = weidth;
    }
    
}
