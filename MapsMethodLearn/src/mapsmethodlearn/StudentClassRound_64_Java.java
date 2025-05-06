
package mapsmethodlearn;


public class StudentClassRound_64_Java {
    
    protected int studentId;
    protected String name;
    protected String email;
    protected String address;

    public StudentClassRound_64_Java() {
    }

    public StudentClassRound_64_Java(int studentId, String name, String email, String address) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    

    @Override
    public String toString() {
        return  "\n \n StudentId: " + studentId + "\n Name: " + name + "\n Email Address: " + email + "\n Address: " + address;
    }
    
    
}
