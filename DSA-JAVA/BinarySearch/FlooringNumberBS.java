package BinarySearch;
public class FlooringNumberBS {
    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 9, 32, 40};
        int ans = flooringOfNumber(arr, 35);
        System.out.println("ceilling of the number is at index :" +  ans);
    }


    static int flooringOfNumber(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target > arr[mid]){
                    start = mid + 1;
                    
                }
                

                else if(target < arr[mid]) {
                    end = mid -1 ;

                }
            
                  
            }
        }
       return  end ; // end = start - 1

    }
    
}
