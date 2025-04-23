
package superclassandsubclass;

import superclassandsubclass.collegeuniversity.College;
import superclassandsubclass.collegeuniversity.University;

public class SuperclassAndSubclass {

  
    public static void main(String[] args) {
        
        College c = new College();
        University u = new University();
        
//        College details
        
        c.setName("Md. Imran Mia");
        c.setId(213);
        c.setGroups("Business Studies");
        c.setCollegeName("JJBSMRC");
        
//        university details
        
        System.out.println(c.details());
        
        u.setName("Md. Imran Mia");
       u.setId(1287829);
       u.setFacalty("Business Facalty");
       u.setDepartments("AIS");
       u.setHall("South Hall");
       u.setUniversity("Dhaka College");
       
        System.out.println(u.studentdetails());
    }
    
}
