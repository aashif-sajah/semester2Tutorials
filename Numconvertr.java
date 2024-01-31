import java.util.Scanner;


public class Numconvertr{
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your length in meters :");
        double meter = input.nextDouble();
        double centi = meter*100;
        int val = (int) Math.round(centi);
        System.out.println("converted centimeter value is :"+ val + "cm");
        input.close();


        

    }

}