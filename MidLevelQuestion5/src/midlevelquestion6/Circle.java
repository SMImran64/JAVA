
package midlevelquestion6;


public class Circle extends Shape{
    
    protected float redious;

    public Circle(float redious) {
        this.redious = redious;
    }

    public float getRedious() {
        return redious;
    }

    public void setRedious(float redious) {
        this.redious = redious;
    }
    

    @Override
    public double area() {
        
        return Math.PI*Math.pow(redious, 2);
    }

    
    
    
    
}
