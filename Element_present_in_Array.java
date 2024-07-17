import java.util.Scanner;
public class Element_present_in_Array{
    public static void main(String[] args) {
        int[] arr = {10,20,30,42,50};        // declaring the array and initializing the value at the same time
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num:");
        int num = sc.nextInt();
        boolean isInArray = false;
        
        for(int element:arr){
            if(num==element){
                isInArray=true;
                break;
            }
        }
            if (isInArray) {
                System.out.println("Yes the element is present in the array");
                
            }
            else{
                System.out.println("No the element is not present in the array");
            }
        
        
    }
}
