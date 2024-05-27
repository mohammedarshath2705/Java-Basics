package project;

import java.util.Arrays;
import java.util.Scanner;

//import java.util.Arrays;

public class AnagramProb {
	static boolean areAnagram(char str1[],char str2[]){
		int n1=str1.length;
		int n2 = str2.length;
		if(n1!=n2) {
			return false;
		}
		Arrays.sort(str1);
		Arrays.sort(str2);
		for(int i=0;i<n1;i++) {
			if(str1[i]!=str2[i]) {
				return false;
			}
		}
		return true;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First string : ");
		String input1 = sc.nextLine();
		System.out.println("Enter the second string : ");
		String input2 = sc.nextLine();
		char str1[] = input1.toCharArray();
		char str2[] = input2.toCharArray();
		if(areAnagram(str1,str2)) {
			System.out.println("it is anagram");
			
		}
		else {
			System.out.println("It is not anagram");
		}
		
		
		sc.close();
	}


}
