
package superclassandsubclass.collegeuniversity;

import superclassandsubclass.EducationSystem;


public class College extends EducationSystem {
    
    private String groups;   
    private String principal;   

   

    public College() {
    }

    public College(String groups, String principal) {
        this.groups = groups;
        this.principal = principal;
    }

    public College(String groups, String principal, String buidings, String classroom, String teacher, String books, String library) {
        super(buidings, classroom, teacher, books, library);
        this.groups = groups;
        this.principal = principal;
    }

   
    
    
}
