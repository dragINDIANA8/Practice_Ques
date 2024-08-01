import java.util.Scanner;
public class voting{
public static void main(String[]args){
    System.out.print("enter your age: ");
    Scanner sc = new Scanner (System.in);
        
        int age = sc.nextInt();
        if(age>=18){
            System.out.print("You are eligible to vote");
        }
        else {
            System.out.print("Sorry, you are not eligible to vote") ;
        }
    }
}
