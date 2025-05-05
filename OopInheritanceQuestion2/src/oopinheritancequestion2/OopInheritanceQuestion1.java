package oopinheritancequestion2;

public class OopInheritanceQuestion1 {

    public static void main(String[] args) {

        Students s = new Students();

        s.setStudentId(1287829);
        s.setName("Imran");
        s.setAge(25);
        s.setAddress("Azimpur");

        System.out.println(s.studentDetails());
    }

}
