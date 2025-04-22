
package aboutobjectandclass;


public class StudentPermanentAddress {
    
         String district;
         String subdistrict;
         int wordnumber;
        String vill; 

    public StudentPermanentAddress() {
    }

    public StudentPermanentAddress(String district, String subdistrict, int wordnumber, String vill) {
        this.district = district;
        this.subdistrict = subdistrict;
        this.wordnumber = wordnumber;
        this.vill = vill;
    }
    
    public  String fullAddress(){
    
        String subInfo = ("\n District : "+district + "\n Sub-District : "+subdistrict+"\n Word Non. : "+wordnumber+"\n Vill : "+vill);
   
        return subInfo; 
    }
    

//    @Override
//    public String toString() {
//        return "StudentPermanentAddress{" + "Shariatpur" + district + ", Jajira," + subdistrict + 01 + wordnumber + ", Lawkhola" + vill + '}';
//    }
        
         
    
    
}
