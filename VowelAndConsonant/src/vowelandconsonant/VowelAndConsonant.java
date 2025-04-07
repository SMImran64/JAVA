
package vowelandconsonant;

import java.util.Scanner;


public class VowelAndConsonant {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter");
        
        char letter = input.next().charAt(0);
        
        if(letter =='a' || letter=='A'){
        
            System.out.println(letter+ " is a vowel");
        }
        else if(letter=='e' || letter =='E'){
            System.out.println(letter+" is a vowel");
        }
        else if(letter=='i' || letter =='I'){
            System.out.println(letter+" is a vowel");
        }
        else if(letter=='o' || letter =='O'){
            System.out.println(letter+" is a vowel");
        }
        else if(letter=='u' || letter =='U'){
            System.out.println(letter+" is a vowel");
        }
        else {
            System.out.println(letter+" is a consonant");
        }
        
    }
    
}
