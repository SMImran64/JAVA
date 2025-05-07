
package mapsmethodlearn;


public class StudentClassRound_64_Java {
    
    protected int studentId;
    protected String name;
    protected String email;
    protected String courseTitle;
    protected String center;
    protected String teacher;
    protected String address;

    public StudentClassRound_64_Java() {
    }

    public StudentClassRound_64_Java(int studentId, String name, String email, String courseTitle, String center, String teacher, String address) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.courseTitle = courseTitle;
        this.center = center;
        this.teacher = teacher;
        this.address = address;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
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

    public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        this.center = center;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    

   

    @Override
    public String toString() {
        return  "\n \n StudentId: " + studentId + "\n Name: " + name +
        "\n Email Address: " + email +"\n Course Title: "+courseTitle+
        "\nClass Constructor: "+teacher+"Course Center: "+center+ "\n Address: " + address;
    }
    
    
}
