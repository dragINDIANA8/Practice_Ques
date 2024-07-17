public class sorted__notSorted_array {

    public static void main(String[] args) {
        
        int [] arr = {1,2,3,4,37,65};
        boolean isSorted = true;

        for(int i =0; i<arr.length-1;i++){
            if (arr[i]>arr[i+1]) {
                isSorted = false;
                break;
                
            }
        }
        if (isSorted) {
            System.out.println("The Array is SORTED");
            
        }
        else{
            System.out.println("The Array is NOT SORTED");
        }
      
        }
    }
