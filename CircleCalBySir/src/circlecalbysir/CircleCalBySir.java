
package circlecalbysir;

import java.util.Scanner;


public class CircleCalBySir {

    
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        double areaOfCircle;

        System.out.println("Enter radius of circle");
        double radius = s.nextDouble();
        
//        boolean status = false

        if (radius <= 0) {

            System.out.println("pls enter More than 0(zero)");

            radius = s.nextDouble();

            areaOfCircle = Math.PI * Math.pow(radius, 2);
        } else {
            areaOfCircle = Math.PI * Math.pow(radius, 2);

        }

        System.out.println(areaOfCircle);

    }
    
}
