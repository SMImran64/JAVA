package superclassandsubclass.collegeuniversity;

import superclassandsubclass.EducationSystem;

public class College extends EducationSystem {

    private String groups;
    private String collegeName;

    public College() {
    }

    public College(String groups, String collegeName) {
        this.groups = groups;
        this.collegeName = collegeName;
    }

    public College(String groups, String collegeName, String name, long id) {
        super(name, id);
        this.groups = groups;
        this.collegeName = collegeName;
    }

    public String getGroups() {
        return groups;
    }

    public void setGroups(String groups) {
        this.groups = groups;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
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

    public String details() {

        String result = ("\n Id No: " + id + "\n Name: " + name + "\n Groups: " + groups + "\n College : " + collegeName);

        return result;
    }
}
