
package shopmainclass;

public class CommonVariable {
    
    String shop;
    int catagory;
    long price;
    long quantity;

    public CommonVariable() {
    }

    public CommonVariable(String shop, int catagory, long price, long quantity) {
        this.shop = shop;
        this.catagory = catagory;
        this.price = price;
        this.quantity = quantity;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public int getCatagory() {
        return catagory;
    }

    public void setCatagory(int catagory) {
        this.catagory = catagory;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "CommonVariable{" + "shop=" + shop + ", catagory=" + catagory + ", price=" + price + ", quantity=" + quantity + '}';
    }
    
}
