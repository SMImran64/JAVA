package mapsmethodlearn;

import java.util.HashMap;
import java.util.Map;

public class MapsMethodLearn {

    public static void main(String[] args) {

        Map<Integer, StudentClassRound_64_Java> imran = new HashMap<>();

        imran.put(1, new StudentClassRound_64_Java(1287829, "imran", "imran@gamil.com", "Azimpur "+"\n"));
        imran.put(2, new StudentClassRound_64_Java(1287829, "masud", "masud@gamil.com", "Azimpur"));
        imran.put(3, new StudentClassRound_64_Java(1287829, "Istiaque", "istiaque@gamil.com", "Azimpur"));
        imran.put(4, new StudentClassRound_64_Java(1287829, "Parvez", "parvez@gamil.com", "Azimpur"));

        System.out.println(imran);
          
    }

}
