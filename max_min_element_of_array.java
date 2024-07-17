public class max_min_element_of_array{
    public static void main(String[] args) {

        // to find the maximum element of an array
        // int[] arr = {10,5,66,45,20};
        // int max = 0;
        // for(int element:arr){
        //     if (element>max) {
        //         max=element;
                
        //     }
        // }
        // System.out.print("the maximum element of an array is: " + max);

        // for finding the min element of an array
        int[] arr = {10,5,66,45,20};
        int min = Integer.MAX_VALUE;
        for(int element:arr){
            if(element<min){
                min = element;
            }
        }
     System.out.println("the minimum element of an array is: " + min);
    }
    
}