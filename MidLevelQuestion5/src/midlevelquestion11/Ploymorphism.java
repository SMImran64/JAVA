package midlevelquestion11;

import java.util.Arrays;

public class Ploymorphism {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(5);
        shapes[1] = new Rectangular(20, 30);
        shapes[2] = new Tringle(20, 10);

        System.out.println(Arrays.deepToString(shapes));

//        for(int i =0 ; i<shapes.length ;i++){
//        
//        
//            shapes[0].area();
//            shapes[1].area();
//            shapes[2].area();
//            
//        
//        }
        for (Shape shp : shapes) {

            shp.area();

        }

    }
}
