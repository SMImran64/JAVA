
package transportrelated;


public class TransportRelated {

   
    public static void main(String[] args) {
       
        CarClass c = new CarClass();
        c.setBrand("BMW");
        c.setSpeed(3000);
        c.setNumberOfDoors("4");
        
        c.VehiclesProperties();
        
        System.out.println("--------Bike Properties----------");
        
        BikeClass b = new BikeClass();
        
        b.setBrand("Yamaha");
        b.setHasCarrier(2);
        b.setSpeed(300);
        
        b.VehiclesProperties();
        
       
    }
    
}
