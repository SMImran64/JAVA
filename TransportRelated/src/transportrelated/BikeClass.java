
package transportrelated;


public class BikeClass extends Vehicles{
    
    protected int hasCarrier;

    public BikeClass() {
    }

    public BikeClass(int hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

    public BikeClass(int hasCarrier, String brand, long speed) {
        super(brand, speed);
        this.hasCarrier = hasCarrier;
    }

    public int getHasCarrier() {
        return hasCarrier;
    }

    public void setHasCarrier(int hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void VehiclesProperties() {
        super.VehiclesProperties(); 
        System.out.println("Number of Carrier: "+hasCarrier);
    }
    
    
    
}
