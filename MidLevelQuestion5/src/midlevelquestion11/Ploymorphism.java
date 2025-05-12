
package midlevelquestion11;

import java.util.Arrays;


public class Ploymorphism {
    
    public static void main(String[] args) {
        
        Shape[] shapes = new Shape[3];
        
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangular(20, 30);
        shapes[2] = new Tringle(20, 10);
        
       
        System.out.println(Arrays.deepToString(shapes));
        
        for(Shape shp : shapes ){
        
            System.out.println(shp.area());
        
        }
    }
    
}
