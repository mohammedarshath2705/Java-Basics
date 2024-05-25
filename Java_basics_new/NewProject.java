package project;
import java.util.Scanner;

public class NewProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age:");
        int N = sc.nextInt();
        System.out.println("Hello, my age is " + N);
        sc.close();
    }
}
