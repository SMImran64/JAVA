
package midlevelquestionNo8;


public class WashingMachine extends Appliance{
    
   private String workCatagory;

    public WashingMachine() {
    }

    public WashingMachine(String workCatagory) {
        this.workCatagory = workCatagory;
    }

    public WashingMachine(String workCatagory, String brand, long price) {
        super(brand, price);
        this.workCatagory = workCatagory;
    }

    public String getWorkCatagory() {
        return workCatagory;
    }

    public void setWorkCatagory(String workCatagory) {
        this.workCatagory = workCatagory;
    }

    @Override
    public String productDetails() {
        return super.productDetails()+"\n Work On: "+workCatagory;
    }

    @Override
    public String toString() {
         return super.productDetails()+"\n Work On: "+workCatagory;
    }

  
}
