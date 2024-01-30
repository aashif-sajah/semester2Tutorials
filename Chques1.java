import java.util.Scanner;

public class Chques1{
    public static void main(String[] args) {
        //creating the scaner object 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name ?");
        String name = input.nextLine();
        System.out.println("Enter your sure name ?");
        String sure_name = input.nextLine();

        // In here i have used charAt to get the specific index from a index not that chatAt return a char .
        char firstletnameString = name.charAt(0);
        char lastletsuString = sure_name.charAt(sure_name.length()-1);
        System.out.println("The 1st letter of your name is \""+firstletnameString+"\" and the last latter of your sure name is \""+lastletsuString+"\"");
        input.close();


    }



}