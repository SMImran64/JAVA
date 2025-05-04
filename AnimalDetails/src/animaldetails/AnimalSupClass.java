
package animaldetails;


public class AnimalSupClass {
    
    protected String makeSound;

    public String getMakeSound() {
        return makeSound;
    }

    public void setMakeSound(String makeSound) {
        this.makeSound = makeSound;
    }
    

    public AnimalSupClass() {
    }
    
    
   public void shawMakeSound(){
   
       System.out.println("The Sound: "+makeSound);
   }
    
}
