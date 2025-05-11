package midlevelquestionNo8;

public class InstanceOfMethod {

    public static void main(String[] args) {

        WashingMachine w = new WashingMachine("Cloths", "Walton", 350000);

        System.out.println(w);

        Refrigerator r = new Refrigerator("Frizze", "Walton", 80000);

        System.out.println(r);

        System.out.println("------Instance of checking------");

        System.out.println("W is the instance of WashingMachine: " + (w instanceof WashingMachine));
        System.out.println("R is the instance of Refrigerator: " + (r instanceof Refrigerator));

    }

}
