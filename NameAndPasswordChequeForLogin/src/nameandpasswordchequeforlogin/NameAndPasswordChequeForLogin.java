package nameandpasswordchequeforlogin;

import java.util.Scanner;

public class NameAndPasswordChequeForLogin {

    public static void main(String[] args) {

        Scanner l = new Scanner(System.in);

        String[] userNames = {"Imran", "Hujaifa", "Abdullah", "Jawad", "Ayad"};

        int[] passwords = {123, 567, 456, 258, 654};

        System.out.print("Enter username: ");
        String name = l.next();

        for (int i = 0; i < userNames.length; i++) {

            if (name.equalsIgnoreCase(userNames[i])) {

                int index = i;
                System.out.print("Enter your password: ");

                int pass = l.nextInt();

                if (pass == passwords[index]) {

                    System.out.println("Welcom " + name);
                } else {

                    System.out.println("Incorrect password");
                }
                break;
            }

            if (i == (userNames.length - 1)) {
                System.out.println("Incorrect username");
            }

        }

    }
}

}
