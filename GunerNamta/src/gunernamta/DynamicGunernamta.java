package gunernamta;

import java.util.Scanner;

public class DynamicGunernamta {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int userInput = s.nextInt();

        for (int i = 1; i <= 10; i++) {
            int result = userInput * i;

            System.out.println(userInput + "*" + i + "=" + result);
        }
    }
}

        
    


//int limit = 100;
//for (int i = 1; i <= limit; i++) {
//    for (int j = 1; j <= 10; j++) {
//        System.out.printf("%d x %d = %d\n", i, j, i * j);
//    }
//    System.out.println();
//}
