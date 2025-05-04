
package transportrelated;


public class CarClass extends Vehicles{
    
    protected String numberOfDoors;

    public CarClass() {
    }

    public CarClass(String numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public CarClass(String numberOfDoors, String brand, long speed) {
        super(brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    public String getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(String numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
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
    

    @Override
    public void VehiclesProperties() {
        super.VehiclesProperties(); 
        System.out.println("Number Of Doors: "+numberOfDoors);
    }
    
}
