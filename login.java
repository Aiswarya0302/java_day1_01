package assingment02;

import java.util.Scanner;

public class login {

    public static void main(String[] args) {

        Scanner one = new Scanner(System.in);

        System.out.println("username: ");
        String username = one.nextLine();

        System.out.println("pwd :");
        int pwd = one.nextInt();

        if (username.equals("Admin") && pwd == 12345) {
            System.out.println("login successfully");
        } else {
            System.out.println("invalid login");
        }

        one.close();
    }
}
