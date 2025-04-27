
package shopmainclass.store;

import shopmainclass.CommonVariable;


public class DepartmentalStore extends CommonVariable{

    
    
    String icecream;
    String rice;
    String bread;
    String chips;
    
    public DepartmentalStore() {
    }

    public DepartmentalStore(String icecream, String rice, String bread, String chips) {
        this.icecream = icecream;
        this.rice = rice;
        this.bread = bread;
        this.chips = chips;
    }

    public DepartmentalStore(String icecream, String rice, String bread, String chips, String shop, int catagory, long price, long quantity) {
        super(shop, catagory, price, quantity);
        this.icecream = icecream;
        this.rice = rice;
        this.bread = bread;
        this.chips = chips;
    }
    
    
}
