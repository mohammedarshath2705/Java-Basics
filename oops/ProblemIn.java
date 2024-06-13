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
/*
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

*/


// pattern prob



public class ProblemIn {

	public static void main(String[] args) {
		final int size = 8;  
        final String msg = " We have cold heart ";  
        
        for (int m = 0; m < size; m++) {  
            for (int n = 0; n <= 4 * size; n++) {  
                double pos1 = Math.sqrt(Math.pow(m - size, 2) + Math.pow(n - size, 2));  
                double pos2 = Math.sqrt(Math.pow(m - size, 2) + Math.pow(n - 3 * size, 2));  
   
                if (pos1 < size + 0.5 || pos2 < size + 0.5) {  
                    System.out.print('*');  
                } else {  
                    System.out.print(' ');  
                }  
            }  
            System.out.print(System.lineSeparator());  
        }  
        for (int m = 1; m <= 2 * size; m++) {  
            for (int n = 0; n < m; n++) {  
                System.out.print(' ');  
            }  
   
            for (int n = 0; n < 4 * size + 1 - 2 * m; n++) {  
                if (m >= 2 && m <= 4) {  
                    int position = n - (4 * size - 2 * m - msg.length()) / 2;  
                    if (position < msg.length() && position >= 0) {  
                        if (m == 3) {  
                            System.out.print(msg.charAt(position));  
                        } else {  
                            System.out.print(' ');  
                        }  
                    }  
                    else {  
                        System.out.print('*');  
                    }  
                }  
                else {  
                    System.out.print('*');  
                }  
            }  
            System.out.print(System.lineSeparator());  
        }
	}
}

