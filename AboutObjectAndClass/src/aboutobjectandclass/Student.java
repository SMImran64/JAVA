package aboutobjectandclass;

public class Student extends StudentPermanentAddress {

    private String name;
    private String email;
    private int id;
    private String courseName;
    private int courseTime;
    private String centerName;
    private String address;
    private int contact;

    public Student() {
    }

    public Student(String name, String email, int id, String CourseName, String address, int contact) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.courseName = CourseName;
        this.address = address;
        this.contact = contact;
    }

    public Student(String name, int contact) {
        this.name = name;
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 6 && name.length() < 20) {
            this.name = name;

        } else {
            System.out.println("Name must be between 6 to 20 character.");
        }

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(int courseTime) {
        this.courseTime = courseTime;
    }

    public String allDataOfStudents() {

        String fullInfo = "ID: " + id + "\n" + "Name: " + name + "\n" + "Email: "
                + email + "\n" + "Course Name: " + courseName + "\n" + "Course Duration: " + courseTime;
//        System.out.println("ID: "+ id +"\n"+"Name: "+ name+ "\n"+"Email: "
//                + email+ "Course Name: "+courseName+ "Time: "+ courseTime );

        return fullInfo;

    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getSubdistrict() {
        return subdistrict;
    }

    public void setSubdistrict(String subdistrict) {
        this.subdistrict = subdistrict;
    }

    public int getWordnumber() {
        return wordnumber;
    }

    public void setWordnumber(int wordnumber) {
        this.wordnumber = wordnumber;
    }

    public String getvill() {
        return vill;
    }

    public void setvill(String vill) {
        this.vill = vill;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", email=" + email + ", id=" + id + ", courseName=" + courseName + ", courseTime=" + courseTime + ", centerName=" + centerName + ", address=" + address + ", contact=" + contact + '}';
    }

    

}
