package premidexam;

import java.util.Scanner;

public class PremidExam {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Truck t = new Truck();

        System.out.println("Enter your Car regular Price");

        double carValue = s.nextDouble();

        t.regularPrice = carValue;

        System.out.println("Enter your car weigth");

        double carWeight = s.nextDouble();

        t.weight = (int) carWeight;

        t.getSalePrice();

    }

}
