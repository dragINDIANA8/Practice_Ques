public class Arr_reverse_arr  {
    public static void main(String[] args) {
        int[] arr = {100,50,60,40,30};

        System.out.println("Array in actual order:");
        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Arrya in reverse order: ");
        for(int i= arr.length-1; i>=0; i--){
            System.out.println(arr[i]+" ");
        }
    }
    
}
