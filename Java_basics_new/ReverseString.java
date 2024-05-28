package project;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String M = sc.nextLine();
		String rev ="";
		for(int i=M.length()-1;i>=0;i--) {
			
			rev = rev + M.charAt(i) ; 	
			}
		System.out.println("Reversed string : " +rev);
		sc.close();

	}

}
