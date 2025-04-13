package arrayscalsstask3;

import java.util.Scanner;

public class ArraysCalssTask3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Your Name");

        String userName = s.next();

        String[] names = {"Imran", "Hujaifa", "Jawad", "Abdullah", "Iyat"};

        String[] passwords = {"i143", "h243", "j543", "a643", "443"};

        for (int i = 0; i < names.length; i++) {

            String pass = "";

            if (userName.equalsIgnoreCase(names[i])) {

                System.out.println("Enter your password ");

                pass = s.next();

                if (pass.equals(passwords[i])) {
                    System.out.println("Assalamualikum " + userName.toUpperCase());
                } else {
                    System.out.println("Invalid Passwords");
                }
                break;
            } else {
                System.out.println("Invalid UserNames ");
            }

        }

    }

}
