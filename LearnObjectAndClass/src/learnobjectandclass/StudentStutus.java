package learnobjectandclass;

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

}
