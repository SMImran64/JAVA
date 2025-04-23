package superclassandsubclass.collegeuniversity;

import superclassandsubclass.EducationSystem;

public class University extends EducationSystem {

    private String facalty;
    private String departments;
    private String hall;
    private String university;

    public University() {
    }

    public University(String facalty, String departments, String hall, String university) {
        this.facalty = facalty;
        this.departments = departments;
        this.hall = hall;
        this.university = university;
    }

    public University(String facalty, String departments, String hall, String university, String name, long id) {
        super(name, id);
        this.facalty = facalty;
        this.departments = departments;
        this.hall = hall;
        this.university = university;
    }

    public String getFacalty() {
        return facalty;
    }

    public void setFacalty(String facalty) {
        this.facalty = facalty;
    }

    public String getDepartments() {
        return departments;
    }

    public void setDepartments(String departments) {
        this.departments = departments;
    }

    public String getHall() {
        return hall;
    }

    public void setHall(String hall) {
        this.hall = hall;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String studentdetails() {

        String value = ("\n Id no: " + id + "\n Name: " + name + "\n Facalty : " + facalty + "\n Departments: " + departments + "\n  Hall " + hall + "\n University : " + university);

        return value;
    }

}
