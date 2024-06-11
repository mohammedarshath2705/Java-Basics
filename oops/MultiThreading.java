package oops;


class FirstThread extends Thread {
    
    FirstThread(String name) {
        super(name);
    }

   
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                System.out.println("FirstThread: " + getName() + " - " + i);
                Thread.sleep(1000); // Sleep for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println("FirstThread interrupted");
        }
    }
}


class SecondThread extends Thread {
 
    SecondThread(String name) {
        super(name);
    }

   
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                System.out.println("SecondThread: " + getName() + " - " + i);
                Thread.sleep(1500); 
            }
        } catch (InterruptedException e) {
            System.out.println("SecondThread interrupted");
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
      
        FirstThread firstThread = new FirstThread("Thread 1");
        firstThread.start();

     
        SecondThread secondThread = new SecondThread("Thread 2");
        secondThread.start();
    }
}
