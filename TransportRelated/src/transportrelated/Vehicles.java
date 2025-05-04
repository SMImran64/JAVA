
package transportrelated;

public class Vehicles {
    
    protected String brand;
    protected long speed;

    public Vehicles() {
    }

    public Vehicles(String brand, long speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public long getSpeed() {
        return speed;
    }

    public void setSpeed(long speed) {
        this.speed = speed;
    }
    
    public void VehiclesProperties(){
    
        System.out.println("Brand Name: "+brand);
        System.out.println("Car Speed : "+speed);
    
    }
}
