
package aboutobjectandclass.sClass;


public class QuadTrangular {
    
    double hight;
    double width;

    public QuadTrangular() {
        
    }

    public QuadTrangular(double hight) {
        this.hight = hight;
    }
    
    public double getResult(){
    
        double result =hight*width;
        
        return result;
    
    }

    public QuadTrangular(double hight, double width) {
        this.hight = hight;
        this.width = width;     
        
        
    }
    
   
    
}






