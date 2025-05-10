package hashcodemethod;

import java.util.Objects;

public class StudentStutus {

    String name;
    String email;
    int marks;

    public StudentStutus() {
    }

    public StudentStutus(String name, String email, int marks) {
        this.name = name;
        this.email = email;
        this.marks = marks;
    }

    public StudentStutus(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public StudentStutus(String name) {
        this.name = name;
    }

    public StudentStutus(int marks) {
        this.marks = marks;
    }
    

    public String getResult() {

        if(marks > 32 ){
        
            return name +" pass and got "+marks;
        }
        else{
        return name +" fail "+ marks;
        }
        
        
    }
//    public double getMarks(){
//    
//    return marks;
//    }
    
    public void setMarks(int marks){
    
    this.marks = marks;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + Objects.hashCode(this.email);
        hash = 79 * hash + this.marks;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final StudentStutus other = (StudentStutus) obj;
        if (this.marks != other.marks) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.email, other.email);
    }
 
}
