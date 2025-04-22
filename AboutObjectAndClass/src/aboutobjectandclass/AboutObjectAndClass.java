
package aboutobjectandclass;




public class AboutObjectAndClass {

   
    public static void main(String[] args) {      
        
       Student s = new Student("Atik", 1287039);
       Student s1 = new Student("Imran", 254);
      
       
        System.out.println(s);
        
         Student p = new Student(); //number1
        
         Student i = new Student("Imran", 1254);
       
               // number 2
        
        s.setName("Imran Mia");
        s.setId(1287829);
        s.setEmail("mr.t.imran@gmail.com");
        s.setCourseName("JEE");
        s.setCourseTime(780);
        
        System.out.println(s.allDataOfStudents());//number 1
        
        System.out.println(i.allDataOfStudents()); //number 2
        
        
        Student f = new Student();
        
    }
    
}
