import java.util.Scanner;

public class Calculator {
    public static void main (String []agrs){

        System.out.print("enter 1st num: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("enter 2nd num: ");
        int b = sc.nextInt();
        System.out.print("Coose operator to perform(+,-,*,/) : ");
        char op = sc.next().charAt(0);
        
        int result;
        boolean playAgain= true;

        switch (op) {
            case '+':
            result = a+b;
            System.out.println("Additon of " + a + "+" + b + "=" + result);
                
                break;

            case '-':
            result = a-b;
            System.out.println("Substraction of " + a + "-" + b + "=" + result);

                 break;

            case '*':
            result = a*b;
            System.out.println("Multiplication of " + a + "*" + b + "=" + result);
                
                break;

                case '/':
            result = a/b;
            System.out.println("Division of " + a + "/" + b + "=" + result);
                
                break;
            
        
            default:
            System.out.println("Enter a valid operator");
                break;
        }

        System.out.println("Do you wish to continue (yes/no) : ");
        String response = sc.next();
        playAgain = response.equalsIgnoreCase("yes");
       
        //while (response.equalsIgnoreCase("yes"));
       // sc.close();


    }

    
}
