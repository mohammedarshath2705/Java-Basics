package project;

import java.util.Scanner;

public class MethodProb {
	       //max of 2 no
	/* static int max(int x,int y) {
		if(x>y) {
			return x;
		}
		else
			return y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int M,N,C;
		System.out.print("Enter the First no : ");
		M=sc.nextInt();
		System.out.print("Enter the second no : ");
		N=sc.nextInt();
		C=max(M,N);
		System.out.println("The greater is " +C);
		sc.close();
		

	} */
	//changing the array value using method
	/*
	static void update(int a[]) {
		a[2]=23;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("Enter the elements : ");
		for(int i=0;i<5;i++) {
			
			a[i] = sc.nextInt();
		}
		System.out.println();
		for(int x:a) {
			System.out.print(x + " ");
		}
		update(a);
		System.out.println();
		for(int x:a) {
			System.out.print(x + " ");
		}
		sc.close();
	}
	*/
	
	// username of mailid
	/*
	static String username(String mailid) {
		int a =mailid.indexOf("@");
		String N = mailid.substring(0,a);
		return N;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the mailid : ");
		String mailid = sc.next();
		String name = username(mailid);
		System.out.println("The name of mail id is " +name);
		sc.close();
		
	}
	*/
	
	//prime or not
	
	static boolean isPrime(int m) {
		for(int i=2; i<m/2 ;i++ ) {
			if(m%i == 0) {
				return false;			
			}	
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(isPrime(n)) {
		System.out.println("The" + " " +n + " " + "is prime");}
		else {
			System.out.println("It is not prime");
			}
		sc.close();
		
	}
	
	
}
