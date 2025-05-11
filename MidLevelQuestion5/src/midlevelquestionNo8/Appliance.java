
package midlevelquestionNo8;


public class Appliance {
    
    protected String brand;
    protected long price;

    public Appliance() {
    }

    public Appliance(String brand, long price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
    
    public String productDetails(){
    
    return "\n Brand Name: "+brand+"\n Regular Price: "+price;
    
    }

    @Override
    public String toString() {
        return "\n Brand Name: "+brand+"\n Regular Price: "+price;
    }
    
}
