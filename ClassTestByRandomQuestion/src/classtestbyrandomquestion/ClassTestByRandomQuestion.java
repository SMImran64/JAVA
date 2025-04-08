package classtestbyrandomquestion;


import java.util.Scanner;

public class ClassTestByRandomQuestion {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter year");
        
        String input = s.next();

        System.out.println("Enter a month");

        String month = s.next();

        System.out.println("Enter a date");

        String date = s.next();
            
//                           1st method
        
//        System.out.println(month+" "+date+","+input);
         
//                          2nd method

//        System.out.println("Output = " + month.concat(" "+date+","+input));

//                            3rd method

        System.out.println(month.concat(" ").concat(""+date).concat(","+input));
        
    }

}
