import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the Grade :");
        int grade = scan.nextInt();
        if (grade > 74){
            System.out.println("Grade: A");
        }
        else if (grade > 60 && grade<=74){
            System.out.println("Grade: B");
        }
        else if (grade >=40 && grade<=60){
            System.out.println("Grade: C");
        }
        else if (grade < 40 ) {
            System.out.println("Grade: C");
        }
        scan.close();
       
        
    }
}
