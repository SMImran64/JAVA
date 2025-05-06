
package stackmethod;

import java.util.Stack;


public class StackMethod {

  
    public static void main(String[] args) {
       
        Stack<String> nameStack = new Stack<>();
        
        nameStack.push("Forid");
        nameStack.push("Reja");
        nameStack.push("Rakib");
        nameStack.push("Parvez");
        
       
//        System.out.println(nameStack.peek());
        nameStack.pop();
         System.out.println(nameStack);
    }
    
}
