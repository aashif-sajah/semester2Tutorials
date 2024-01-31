import java.util.Scanner;

public class Tempconverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temparature in centigrade :");
        double centigrade = scanner.nextDouble();
        double feranhite =  (9.0/5)* centigrade + 32;
        System.out.println("Emter converted feranhite value is :"+feranhite+ "Fer");
    }
}