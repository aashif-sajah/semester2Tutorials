import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 1st number :");
        double num1 = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter the oparator (+,-,/,*):");
        String oparator = scan.nextLine();
        System.out.println("Enter the 2nd number :");
        double num2 = scan.nextDouble();
        scan.nextLine();
        switch (oparator) {
            case "+":
                double finall = num1 + num2;
                System.out.println("Answer is :" + finall);
                break;

            case "-":
                finall = num1 - num2;
                System.out.println("Answer is :" + finall);
                break;
            case "*":
                finall = num1 * num2;
                System.out.println("Answer is :" + finall);
                break;
            case "/":
                finall = num1 / num2;
                System.out.println("Answer is :" + finall);
                break;

            default:
                System.out.println("Invalid oparator");
                break;
        }

    }
}
