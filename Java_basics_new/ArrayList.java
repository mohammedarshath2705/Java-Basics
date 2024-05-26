package project;

import java.util.Scanner;

public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array size : ");
		m=sc.nextInt();
		int []a = new int[10];
		System.out.println("Enter the array elements : ");
		for(int i=0;i<=m;i++) {
			a[i]=sc.nextInt();
			
		}
		System.out.println("The array elements are : ");
		for(int i=0;i<=m;i++) {
			System.out.println(a[i]);
		}
		sc.close();
	}
	

}
