package oops;

//import java.util.Arrays;
//import java.util.Scanner;
//import java.util.*;
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

/*

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
*/
//odd or even in array
/*
public class ProblemIn {

	public static void main(String[] args) {
		
		int[] array_nums = {1,2,3,4,5,6,7,8,9,10};
		
		
		System.out.println("Original Array: " + Arrays.toString(array_nums));
		 int ctr = 0;
		 for (int i = 0; i < array_nums.length; i++) {
	            if (array_nums[i] % 2 == 0)
	                ctr++;
	        }
		 
		 System.out.println("Number of even numbers : " + ctr);
	        System.out.println("Number of odd numbers  : " + (array_nums.length - ctr));
	}

	}
*/

/*
public class ProblemIn {
	static boolean checkPerfectSquare(double number)    
	{   
		for (int i=1; i*i<=number; i++)   
		{   
		
		if((number%i==0) && (number/i==i))   
		{   
		
		return true;   
		}   
		}   
	
		return false;   
		}   
	

	public static void main(String[] args) {
		System.out.print("Enter any number: "); 
		Scanner sc=new Scanner(System.in);  
		double number=sc.nextDouble();   
		if (checkPerfectSquare(number))   
			System.out.print("Yes, the given number is perfect square.");   
			else  
			System.out.print("No, the given number is not perfect square.");   
			sc.close();
}
}
*/
/*

// palindrome no prob
public class ProblemIn {
	public static void main(String[] args) {
	/* 	int r;
		int sum=0,temp; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		
		temp=n;
		
		
		while(n>0){    
			   r=n%10;  
			   sum=(sum*10)+r;    
			   n=n/10;    
			  }    
		
		 if(temp==sum)    
			   System.out.println("palindrome number ");    
			  else    
			   System.out.println("not palindrome");  
		String original, reverse = ""; // Objects of String class  
	      Scanner in = new Scanner(System.in);   
	      System.out.println("Enter a string/number to check if it is a palindrome");  
	      original = in.nextLine();   
	      int length = original.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + original.charAt(i);  
	      if (original.equals(reverse))  
	         System.out.println("Entered string/number is a palindrome.");  
	      else  
	         System.out.println("Entered string/number isn't a palindrome.");   
		 in.close();
		
	}
}*/
/*
public class ProblemIn {
	public static void main(String[] args) {
		//Integer m2 = Integer.valueOf("11111111", 2);
		//System.out.println(Integer.MAX_VALUE);
		int n1=0,n2=1,n3,i,count=20;    
		 System.out.print(n1+" "+n2);
		    
		 for(i=2;i<count;++i)
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    

	}
	}


*/
/*

public class ProblemIn {
	static int GCD(int x, int y) 
    { 
       /* 
        if (x == 0) 
            return y; 
        if (y == 0) 
            return x; 
  
        
        if (x == y) 
            return x; 
  
        
        if (x > y) 
            return GCD(x - y, y); 
        return GCD(x, y - x); 
        
		if(y==0) {
			return x;
		}
		else
			return GCD(y,x%y);
    } 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Number:");
		int x = sc.nextInt();
		System.out.print("Enter the Second Number:");
		int y = sc.nextInt();
		
        System.out.println("GCD of " + x + " and " + y 
                           + " is " + GCD(x, y)); 
        sc.close();
	}
	}
	*/
//primefactor
/*public class ProblemIn {
	static void PrimeFactor(int n) {
		if(n <= 1)
			return;

		while(n % 2 == 0)
		{
			System.out.print(2+" ");

			n = n / 2;
		}
		while(n % 3 == 0)
		{
			System.out.print(3+" ");

			n = n / 3;
		}
		for(int i=5; i*i<=n; i=i+6)
		{
			while(n % i == 0)
			{
				System.out.print(i+" ");

				n = n / i;
			}

			while(n % (i + 2) == 0)
			{
				System.out.print((i + 2)+" ");

				n = n / (i + 2);
			}
		}
		if(n > 3)
			System.out.print(n+" ");

		System.out.println();

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int x = sc.nextInt();
		PrimeFactor(x);
		sc.close();
	}
}
*/
//prefix
/*
public class ProblemIn {
	public String longestCommonPrefix(String[] S) {
		if (S.length == 0) return "";
		String prefix = S[0];
		for (int i = 1; i < S.length; i++)
			while (S[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty()) return "";
			}        
		return prefix;}
	public static void main(String[] args) {
		ProblemIn ob = new ProblemIn();
		String s[] = {"flow", "flower", "flame"};
		System.out.println(ob.longestCommonPrefix(s));
	}
}
*/

/*
public class ProblemIn {

    abstract static class Shape {
        public abstract double getArea();
        public abstract double getPerimeter();
    }

    static class Rectangle extends Shape {
        private double length;
        private double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        public double getArea() {
            return length * width;
        }

        public double getPerimeter() {
            return 2 * (length + width);
        }
    }

    static class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }

        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }
    }

    static class Square extends Rectangle {
        public Square(double side) {
            super(side, side);
        }

        
    }

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4, 6);
        Shape circle = new Circle(3);
        Shape square = new Square(5);

        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle perimeter: " + circle.getPerimeter());
        System.out.println("Square area: " + square.getArea());
        System.out.println("Square perimeter: " + square.getPerimeter());
    }
}
*/
interface SumCalculator {
    int sum(int a, int b);
}
public class ProblemIn {
	 public static void main(String[] args) {
		 SumCalculator sumCalculator = (x, y) -> x + y;
	        int result = sumCalculator.sum(7, 6);
	        System.out.println("Sum 7,6): " + result);
		result = sumCalculator.sum(15, -35);
	        System.out.println("Sum 15, -35): " + result);
	 }
}
