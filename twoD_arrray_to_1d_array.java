import java.util.Scanner;
public class twoD_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int col = sc.nextInt();

        int[][] arr = new int[rows][col];
        System.out.println("Enter elements:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < col; j++)
                arr[i][j] = sc.nextInt();

        // 1D arrayyyyyyy

        for (int i = 0; i < rows; i++){
            if (i % 2 == 0){
                for (int j = 0; j < col; j++)
                    System.out.print(arr[i][j] + " ");
            } else{
                for (int j = col - 1; j >= 0; j--)
                    System.out.print(arr[i][j] + " ");
            }
        }
    }
}
