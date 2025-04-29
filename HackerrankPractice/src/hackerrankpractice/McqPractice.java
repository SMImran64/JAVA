package hackerrankpractice;

public class McqPractice {

    public static void main(String[] args) {
        int i = 2, j = 11;
        do {
            if (i > j) {
                break;
            }
            j--;
        } while (++i < 6);
        System.out.println("i =" +i +" and j = "+j);
    


    }
}
