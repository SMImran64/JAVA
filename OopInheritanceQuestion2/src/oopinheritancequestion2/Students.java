package oopinheritancequestion2;

public class Students extends Person {

    protected int studentId;
    protected String Address;

    public Students() {
    }

    public Students(int studentId) {
        this.studentId = studentId;
    }

    public Students(int studentId, String Address) {
        this.studentId = studentId;
        this.Address = Address;
    }

    public Students(int studentId, String Address, String name, int age) {
        super(name, age);
        this.studentId = studentId;
        this.Address = Address;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    @Override
    public String studentDetails() {

        return "Student Id: " + studentId + "\n Student Name: " + name + "\n Student Age: " + age + "\n Address: " + Address;

    }

}
