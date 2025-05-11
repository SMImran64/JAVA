
package midlevelquestionNo8;


public class Refrigerator extends Appliance{
    
    private String type;

    public Refrigerator() {
    }

    public Refrigerator(String type) {
        this.type = type;
    }

    public Refrigerator(String type, String brand, long price) {
        super(brand, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String productDetails() {
        return super.productDetails()+"\n Work Type: "+type;
    }

    @Override
    public String toString() {
        return super.productDetails()+"\n Work Type: "+type;
    }
    
    
    
}
