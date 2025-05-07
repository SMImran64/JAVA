package mapsmethodlearn;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapsMethodLearn {

    public static void main(String[] args) {
        
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter your Key Number : ");
            
            int studentId = s.nextInt();
            
            Map<Integer,StudentClassRound_64_Java> stDetails = new HashMap<>();
            
            stDetails.put(1001,new StudentClassRound_64_Java(1287829, "Md. Imran Mia ", "mr.t.imran11@gamil.com", "Java", "CCSl", "Md. Emran Hossain", "Azimpur"));
            stDetails.put(1002,new StudentClassRound_64_Java(1287462, "Abdullah-Al Masud ", "mr.t.imran11@gamil.com", "Java", "CCSl", "Md. Emran Hossain", "Khilgawn"));
            stDetails.put(1003,new StudentClassRound_64_Java(1287748, "Samim Junayet Istique ", "mr.t.imran11@gamil.com", "Java", "CCSl", "Md. Emran Hossain", "Khilgawn"));
            stDetails.put(1004,new StudentClassRound_64_Java(1287271, "Md. Atiqur Rahman ", "mr.t.imran11@gamil.com", "Java", "CCSl", "Md. Emran Hossain", "Khilgawn"));
            stDetails.put(1005,new StudentClassRound_64_Java(1287759, "CM Rejaul Karim ", "mr.t.imran11@gamil.com", "Java", "CCSl", "Md. Emran Hossain", "Khilgawn"));
            stDetails.put(1006,new StudentClassRound_64_Java(1287470, "Md. Eiasin Prodhan ", "mr.t.imran11@gamil.com", "Java", "CCSl", "Md. Emran Hossain", "Khilgawn"));
            stDetails.put(1007,new StudentClassRound_64_Java(1287799, "Md. Parvej Hossen ", "mr.t.imran11@gamil.com", "Java", "CCSl", "Md. Emran Hossain", "Khilgawn"));
            stDetails.put(1008,new StudentClassRound_64_Java(1287675, "Md. Rakib Islam ", "mr.t.imran11@gamil.com", "Java", "CCSl", "Md. Emran Hossain", "Khilgawn"));
            stDetails.put(1009,new StudentClassRound_64_Java(1287315, "Mrs. Sathe Khanom ", "mr.t.imran11@gamil.com", "Java", "CCSl", "Md. Emran Hossain", "Khilgawn"));
            stDetails.put(1010,new StudentClassRound_64_Java(1287519, "Md. RahmatUllah Shahrukh ", "mr.t.imran11@gamil.com", "Java", "CCSl", "Md. Emran Hossain", "Khilgawn"));
            stDetails.put(1011,new StudentClassRound_64_Java(1287829, "Md. Imran Mia ", "mr.t.imran11@gamil.com", "Java", "CCSl", "Md. Emran Hossain", "Khilgawn"));
            stDetails.put(1012,new StudentClassRound_64_Java(1287647, "Md. Sadiar Rahman ", "mr.t.imran11@gamil.com", "Java", "CCSl", "Md. Emran Hossain", "Khilgawn"));
            stDetails.put(1013,new StudentClassRound_64_Java(1287039, "Md. Atiqul Islam ", "mr.t.imran11@gamil.com", "Java", "CCSl", "Md. Emran Hossain", "Khilgawn"));
            stDetails.put(1014,new StudentClassRound_64_Java(1287519, "Mrs. halima Akter ", "mr.t.imran11@gamil.com", "Java", "CCSl", "Md. Emran Hossain", "Khilgawn"));
            
            System.out.println("Student Information are given bellow");
            
            System.out.println(stDetails.get(studentId).toString());
            
        } catch (Exception e) {
            
            System.out.println("Invalid id Number!! Please enter your correct Id ");
        }
          
    }

}
