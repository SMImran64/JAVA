package vowelconsonant2;

import java.util.Scanner;

public class VowelConsonant2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter");

        char letter = input.next().toLowerCase().charAt(0);

        if (letter == 'a' || letter == 'e' || letter == 'i'
            || letter == 'o' || letter == 'u') {

            System.out.println(letter + " is a vowel");
        }
        else if(letter >='a'|| letter >= 'z'){
            System.out.println(letter+" is a Consonant");
        }
        
        else {
            System.err.println(letter + " is not a letter");
        }
    }

}
 