import java.util.Scanner;
class Codechef
{
	public static void main (String[] args)
	{
		// your code goes here
		Scanner sc = new Scanner(System.in); // enter the no. you want to find the factorial of and then it will print the factorial of that no.
		int n= sc.nextInt();
		int fact = 1;
		for(int i=1; i<=n;i++){
		    fact = fact*i;
		}
		System.out.println(fact);

	}
}
