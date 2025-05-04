
package xamtaken4maybysir;


public class Student extends Person{
    
    protected int studentId;

    public Student() {
    }
    

    public Student(int studentId) {
        this.studentId = studentId;
    }

    public Student(int studentId, String name, int age) {
        super(name, age);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    
    
    

//    @Override
//    public String studentDetails() {
//        return super.studentDetails()+getStudentId(); 
//    }
//    

    @Override
    public void studentDetails() {
        super.studentDetails(); 
        System.out.println("Student id: "+studentId);
    }

}
