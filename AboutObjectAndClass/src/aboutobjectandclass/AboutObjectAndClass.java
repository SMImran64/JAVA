package aboutobjectandclass;

public class AboutObjectAndClass {

    public static void main(String[] args) {

        Student s = new Student("Atik", 1287039);
        Student s1 = new Student("Imran", 254);

        System.out.println(s);
        System.out.println(s1);
//          
//            Subclass

        s.setName("Imran Mia");
        s.setId(1287829);
        s.setEmail("mr.t.imran@gmail.com");
        s.setCourseName("JEE");
        s.setCourseTime(780);

//        SuperClass

        s.setDistrict(" Shariatpur");
        s.setSubdistrict("Jajira");
        s.setvill("Lawkhola");
        s.setWordnumber(9);

//        output

        System.out.println(s.allDataOfStudents());
        System.out.println(s.fullAddress());

    }

}
