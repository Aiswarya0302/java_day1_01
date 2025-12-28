package assingment02;

import java.util.Scanner;

public class lenght {

	public static void main(String[] args) {
	
		
		Scanner one =new Scanner(System.in);
		
		System.out.println("Enter the Password :");
		
		String pwd = one.nextLine();
		
		if(pwd.length()<8) {
			System.out.println("Weak password");
		}
 one.close();
	}

}
