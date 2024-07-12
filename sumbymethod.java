import java.util.Scanner;

public class sumbymethod {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter num 1: ");
        int a = sc.nextInt();
        System.out.print("enter num 2: ");
        int b = sc.nextInt();



        int ans = sum(a, b);           // or if we wanna show without using the scanner class then we can simply write
        System.out.println(ans);       // int ans = sum(20,30);
                                       // System.out.print(ans);

    }

    static int sum(int a, int b) {

        int sum = a + b;
        return sum;
    }

}
