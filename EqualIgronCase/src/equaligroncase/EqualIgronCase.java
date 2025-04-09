
package equaligroncase;

import java.util.Scanner;


public class EqualIgronCase {

    
    public static void main(String[] args) {
        
        Scanner g = new Scanner(System.in);
        
        System.out.println("Enter a letter");
        
        String letter = g.next();
        
        if(letter.equalsIgnoreCase( "a")||letter.equalsIgnoreCase( "e")||letter.equalsIgnoreCase( "i")||
                letter.equalsIgnoreCase( "o")||letter.equalsIgnoreCase("u")){
            
            System.out.println(letter+" is vowel");        
        }
        else if(letter == "a" && letter == "z"){
            System.out.println(letter+" is a consonant");
        }
        else{
            System.err.println(letter+" is not a letter");
        }
        
    }
    
}
