import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name ?");
        String name = scanner.nextLine();
        System.out.println("Enter your age ?");
        int age = scanner.nextInt();
        System.out.println("Hello " + name + " i hope your age is " + age);


        
    }
    
}
