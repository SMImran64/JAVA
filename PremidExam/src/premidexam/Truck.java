package premidexam;

public class Truck extends Vehicle {

    public int weight;

    public Truck() {
    }

    public Truck(int weight, int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    public Truck(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void getSalePrice() {
        double result = 0;
        double discount = 0;
        if (this.weight > 2000) {

            discount = (regularPrice * 0.1);
            result = (regularPrice - discount);
            
            System.out.println("Your Discount amount : "+discount);
            
            System.out.println("Your Actual Payable amount : "+ result);
        } else {

            System.err.println("You cannot get discount!!!");
            System.out.println("Your Payable amount is : "+regularPrice);
        }

       
    }

   

}
