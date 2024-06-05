package oops;

/*
	abstract class Parent{
		public Parent() {
			System.out.println("Constr");
		}
		public void Meth1() {
			System.out.println("meth1 is came");
		}
		abstract void meth2();
	}

	class Child extends Parent{
		public void meth2() {
			System.out.println("meth2 is came");
		}
	}
	public class ClassAbstarct {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent m;
		m=new Child();
	//Child C = new Child();
		m.Meth1();
		m.meth2();
	//	C.Meth1();
	//	C.meth2();
		
	}

}
*/


// Interfaces
/*
interface Test1
{
     int X=10;
    public abstract void meth1();
    public abstract void meth2();
    public static void meth3()
    {
        System.out.println("Meth3 of Test");
    }
}
interface Test2 extends Test1
{
    void meth4();
}
class My implements Test2
{
    public void meth1(){System.out.println("Meth1");}
    public void meth2(){System.out.println("Meth2");}
    public void meth4(){System.out.println("Meth4");}
}
class He implements Test1{
	public void meth1() {
		System.out.println("Meth1");
	}
    public  void meth2() {
    	System.out.println("Meth2");
    }
    public void meth5() {
    	System.out.println("Meth5");
    }
}

public class ClassAbstarct {
	public static void main(String[] args) {
		System.out.println(Test1.X);
        Test1.meth3();
        
        
	}
	}
*/


interface Vehicle {
    
   
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}

class Bicycle implements Vehicle{
    
    int speed;
    int gear;  
    public void changeGear(int newGear){
        
        gear = newGear;
    }    
    public void speedUp(int increment){
        
        speed = speed + increment;
    }      
    public void applyBrakes(int decrement){
        
        speed = speed - decrement;
    }  
    public void printStates() {
        System.out.println("speed: " + speed
            + " gear: " + gear);
    }
}
class Bike implements Vehicle {
    
    int speed;
    int gear;
    
    
    public void changeGear(int newGear){
        
        gear = newGear;
    }
    
    
    public void speedUp(int increment){
        
        speed = speed + increment;
    }
    
    
    public void applyBrakes(int decrement){
        
        speed = speed - decrement;
    }
    
    public void printStates() {
        System.out.println("speed: " + speed
            + " gear: " + gear);
    }
    
}
public class ClassAbstarct {
	public static void main(String[] args) {
		Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);
        System.out.println("Bicycle present state :");
        bicycle.printStates();
        
        Bike bike = new Bike();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrakes(3);
        System.out.println("Bike present state :");
        bike.printStates();
    
        
        
	}
	}