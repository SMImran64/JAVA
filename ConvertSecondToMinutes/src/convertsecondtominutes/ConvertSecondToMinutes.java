
package convertsecondtominutes;


import java.util.Scanner;


public class ConvertSecondToMinutes {

    
    public static void main(String[] args) {
        
//        Scanner scanner = new Scanner(System.in);
//        
//        System.out.println("Enter Second");  
//        int totalSeconds = scanner.nextInt();
//       
//        int hours = totalSeconds/3600;  
//        
//        int remainingSecond = totalSeconds%3600;
//        
//        int minutes= remainingSecond/60;
//        
//        int seconds= remainingSecond%60;
//        
//        
//        System.out.println(totalSeconds+" seconds= "+hours+" hours ,"+minutes
//                +" Minutes "+ seconds + "seconds");

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Sencond");
        
        int totalSeconds = scanner.nextInt();
        
        int hours = totalSeconds/3600;
        int remainingSecond = totalSeconds%3600;
        
        int minutes = remainingSecond/60;
        
       int seconds = remainingSecond%60;
       
        System.out.println(hours +" hours ,"+minutes +" Minutes ,"+ seconds+ "seconds");
        
        
        
    }
    
}
