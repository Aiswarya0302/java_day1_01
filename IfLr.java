package assingment02;

import java.util.Scanner;

public class IfLr {

	public static void main(String[] args) {
		
 Scanner obj = new Scanner(System.in);
 
 System.out.println("Enter your age :");
 int age = obj.nextInt();
 
 System.out.println("Enter your age :");
 
 if(age<=13) {
	 System.out.println("Child");
 }
 else if(age >13 && age<=20){
	 System.out.println("Teenage");
	
 }
 else if(age>20 && age<=60) {
	 System.out.println("Adult");
 }
 else {
	 System.out.println("Senior Citizen");
 }
 obj.close();
 
	}
	
	

}
