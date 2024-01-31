import java.util.*;


public class Company {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the numer of Manual employees :");
        int manual = s1.nextInt();
        System.out.println("Enter the numer of skilled employees :");
        int skilled = s1.nextInt();
        System.out.println("Enter the numer of Management employees :");
        int management = s1.nextInt();
        Double total = (manual*500.0) + (skilled*700.0) + (management*800.0);
        double tax = total * 0.20;
        System.out.println("The wage bill is :"+ total+ "$,\nAnd the tax amount is : "+ tax+"$.");
        s1.close();

    }
    
}
