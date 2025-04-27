package arraylistclass;

import java.util.ArrayList;

public class ArrayListClass {

    public static void main(String[] args) {

        Student s = new Student("E", 12548);

        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(s);
        studentList.add(new Student("A", "a", 12, "java", "Azimpur", 1254));
        studentList.add(new Student("B", "b", 13, "java", "Azimpur", 1354));
        studentList.add(new Student("C", "c", 14, "java", "Azimpur", 1454));
        studentList.add(new Student("D", "d", 15, "java", "Azimpur", 15254));

        System.out.println(studentList);

        for (Student value : studentList) {
            System.out.println(value);
//        for (int index = 0; index < studentList.size(); index++) {
//
//            System.out.println(index);
        }

    }
}

}
