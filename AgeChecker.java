import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = scan.nextInt();
        if (age>= 18){
            System.out.println("Over 18");
        }
        else if (age>=0){
            System.out.println("Under 18");
        }
        else{
            System.out.println("Incorrect age ");
        }
        
    }
}
