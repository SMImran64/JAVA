
package abstractclasslearning;

import abstractclasslearning.abs.Geomatric;
import abstractclasslearning.geoObj.Circle;
import abstractclasslearning.geoObj.Ractangular;


public class AbstractClassLearning {

  
    public static void main(String[] args) {
      
        Geomatric gCircle = new Circle(5);
        
        System.out.println(gCircle.getArea());
        System.out.println(gCircle.getPerimeter());
        
        Geomatric gRactangular = new Ractangular(20, 30);
        
        System.out.println(gRactangular.getArea());
        System.out.println(gRactangular.getPerimeter());
    }
    
}
