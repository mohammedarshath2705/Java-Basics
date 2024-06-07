package oops;
/*
interface Flyable {
	void flying();
}

class Spacecraft implements Flyable{
	public void flying() {
		System.out.println("Spacecraft is Flying");
		}
}


class Aeroplane implements Flyable{
	public void flying() {
		System.out.println("Aeroplane is Flying");
	}
}


class Helicopter implements Flyable{
	public void flying() {
		System.out.println("Helicopter is Flying");
	}
}
public class ProblemIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Flyable[] flyingObjects = {new Spacecraft(), new Aeroplane(), new Helicopter()};
		//for(Flyable obj : flyingObjects) {
	//		obj.flying();
	//	}
		Flyable Spacecraft = new Spacecraft();
		Flyable Aeroplane = new Aeroplane();
		Flyable Helicopter = new Helicopter();
		
		Spacecraft.flying();
		Aeroplane.flying();
		Helicopter.flying();
	}

}
*/

import java.util.Scanner;

class Teenage{
	private String name;
	private int age;
	private String country;
	
	public String getname() {
		return name;
	}
	public int getage() {
		return age;
	}
	public String getcountry() {
		return country;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	public void setage( int age) {
		this.age = age;
	}
	public void setcountry(String country) {
		this.country = country;
	}
	
	public void display() {
		System.out.println("The name is " + name  + " and the age is " + age + ".");
		System.out.println("My country is " + country);
	} 
}

public class ProblemIn {

	public static void main(String[] args) {
		
		Teenage T = new Teenage();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name :");
		String N = sc.next();
		T.setname(N);
		System.out.print("Enter the age :");
		int A = sc.nextInt();
		T.setage(A);
		System.out.print("Enter the Country :");
		String C = sc.next();
		T.setcountry(C);
		
		N=T.getname();
		A=T.getage();
		C=T.getcountry();
		
		T.display();
		
		sc.close();
	}
	}





