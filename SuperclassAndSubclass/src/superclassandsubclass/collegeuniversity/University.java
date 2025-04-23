
package superclassandsubclass.collegeuniversity;

import superclassandsubclass.EducationSystem;


public class University extends EducationSystem{
    
    private String facalty;
    private String vc;
    private String departments;
    private String hall;

    public University() {
    }

    public University(String facalty, String vc, String departments, String hall) {
        this.facalty = facalty;
        this.vc = vc;
        this.departments = departments;
        this.hall = hall;
    }

    public University(String facalty, String vc, String departments, String hall, String buidings, String classroom, String teacher, String books, String library) {
        super(buidings, classroom, teacher, books, library);
        this.facalty = facalty;
        this.vc = vc;
        this.departments = departments;
        this.hall = hall;
    }
    
    
    
    
}
