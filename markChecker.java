import java.util.Scanner;

public class markChecker {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your exxam mark");
        int em = scan.nextInt();
        System.out.println("Enter your CW mark");
        int cw = scan.nextInt();
        if (em >=30 && cw >=30){
            double finall =(em+cw)/2;
            if (finall >=40){
                System.out.println("Pass");
            }
        }else{
            System.out.println("Fail");
        }

    }
}
