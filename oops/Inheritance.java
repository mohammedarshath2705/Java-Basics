package oops;
/*
class Circle1{
	public double radius;
	public Circle1() {
		  radius=10;
	}
	public Circle1(double l) {
		radius=l;
	}
	 
	public double area() {
		return Math.PI*radius*radius;
	}
	public double perimeter() {
		return 2*Math.PI*radius;
	}
	public double circumference() {
		return perimeter();
	}
}

class Cylinder extends Circle{
	private double height;
	
	public Cylinder(double m) {
		height=m;
	}
	
	public double volume() {
		return area() * height;
	}
	
}
public class Inheritance {

public static void main(String[] args){
		
		Circle1 c1 = new Circle1(10);
		Cylinder a1 = new Cylinder(10);
		
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
        System.out.println(c1.circumference());
        System.out.println(a1.volume());
        System.out.println(a1.area());
        System.out.println(a1.circumference());
		
		
		
	}
} */


/*
class Account {
    private String accNo;
    private String name;
    private String address;
    private String phno;
    private String dob;
    protected long balance;
    
    public Account(String acc, String n, String add, String phno, String dob) {
        accNo = acc;
        name = n;
        address = add;
        this.phno = phno;
        this.dob = dob;
        balance = 0;
    }
    
    public String getAccNo() {
        return accNo;
    }
    
    public String getName() {
        return name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getPhno() {
        return phno;
    }
    
    public String getDOB() {
        return dob;
    }
    
    public long getBalance() {
        return balance;
    }
    
    public void setAddress(String add) {
        address = add;
    }
    
    public void setPhno(String phno) {
        this.phno = phno;
    }
    
    public void display() {
        System.out.println("Account No: " + accNo);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone No: " + phno);
        System.out.println("DOB: " + dob);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(String acc, String n, String add, String phno, String dob) {
        super(acc, n, add, phno, dob);
    }
    
    public void deposit(long amt) {
        balance += amt;
    }
    
    public void withdraw(long amt) {
        balance -= amt;
    }
}

class LoanAccount extends Account {
    public LoanAccount(String acc, String n, String add, String phno, String dob) {
        super(acc, n, add, phno, dob);
    }
    
    public void payEMI(long amt) {
        balance -= amt;
    }
    
    public void repay(long amt) {
        if (balance == amt) {
            balance = 0;
        }
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Account A1 = new Account("a21s311", "mani", "delhi", "98101z", "27-09-2020");
        SavingsAccount B1 = new SavingsAccount("a21s312", "anil", "mumbai", "98102y", "15-08-1995");
        LoanAccount C1 = new LoanAccount("a21s313", "sunil", "bangalore", "98103x", "30-05-1985");
        
        A1.display();
        B1.display();
        C1.display();
        
        B1.deposit(5000);
        B1.withdraw(1000);
        B1.display();
        
        C1.payEMI(2000);
        C1.display();
    }
}
*/

/*
class Circle1{
	public double radius;
	public Circle1() {
		  radius=10;
	}
	public Circle1(double l) {
		radius=l;
	}
	 
	public double area() {
		return Math.PI*radius*radius;
	}
	public double perimeter() {
		return 2*Math.PI*radius;
	}
	public double circumference() {
		return perimeter();
	}
}

class Cylinder extends Circle1{
	public double height;
	
	public Cylinder() {
		
	}
	public Cylinder(double l,double m) {
		super(l);
		height=m;
	}
	
	public double volume() {
		return area() * height;
	}
	
}
public class Inheritance {
    public static void main(String[] args) {
    	Circle1 A1 = new Circle1();
    	A1.radius=10;
    	Cylinder c1 = new Cylinder();
    	c1.height=10;
    	System.out.println(c1.volume());
    	System.out.println(A1.area());
    	
    }}

*/

//method overriding


class Super{
	public void display(){
		System.out.println("Hello");
	}
	public void wanting() {
		System.out.println("Its a game");
	}
	public void nerpeme() {
		System.out.println("old sessioon");
	}
}
class Sub extends Super{
	public void display(){ //method overriding
		System.out.println("Hello world");
	}
	public void wanting() {
		System.out.println("Its a new game");
	}
	public void hexawere() {
		System.out.println("Session");
	}
}

public class Inheritance {
    public static void main(String[] args) {
    	//Super su = new Super();
    	//su.display();
    	//Sub e = new Sub();
    	//e.display();
    	//Super su = new Sub();
    	//su.display();
    	//su.wanting();
    	//Super q = new Super();
    	//q.wanting();
    	Sub w = new Sub();
    	w.nerpeme();
    	
    }
}
