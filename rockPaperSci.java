import java.util.*;

public class rockPaperSci {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your choice (0 == Rock, 1 == Paper or 2 == Scissors):");
        int usrChoice = scan.nextInt();
        int pcChoice = ran.nextInt(3);
        switch (usrChoice) {
            case 0:
                if (pcChoice == 0) {
                    System.out.println("Its a tie \nyour choice is :" + usrChoice + "\nPC choice is :" + pcChoice);
                } else if (pcChoice == 1) {
                    System.out.println("Pc won \nyour choice is :" + usrChoice + "\nPC choice is :" + pcChoice);
                } else if (pcChoice == 2) {
                    System.out.println("You won \nyour choice is :" + usrChoice + "\nPC choice is :" + pcChoice);
                }

                break;
            case 1:
                if (pcChoice == 0) {
                    System.out.println("You won \nyour choice is :" + usrChoice + "\nPC choice is :" + pcChoice);

                } else if (pcChoice == 1) {
                    System.out.println("Its a tie \nyour choice is :" + usrChoice + "\nPC choice is :" + pcChoice);
                } else if (pcChoice == 2) {
                    System.out.println("Pc won \nyour choice is :" + usrChoice + "\nPC choice is :" + pcChoice);
                }
                break;
            case 2:
                if (pcChoice == 0) {
                    System.out.println("Pc won \nyour choice is :" + usrChoice + "\nPC choice is :" + pcChoice);
                    System.out.println("You won \nyour choice is :" + usrChoice + "\nPC choice is :" + pcChoice);

                } else if (pcChoice == 1) {
                    System.out.println("You won \nyour choice is :" + usrChoice + "\nPC choice is :" + pcChoice);

                } else if (pcChoice == 2) {
                    System.out.println("Its a tie \nyour choice is :" + usrChoice + "\nPC choice is :" + pcChoice);
                }
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }
        scan.close();

    }
}
