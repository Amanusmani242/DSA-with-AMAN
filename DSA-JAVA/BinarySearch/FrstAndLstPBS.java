package BinarySearch;

class FrstAndLstPBS {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int ans = Search(arr, 8, true);
        int ans1 = Search(arr,8, false);
        System.out.println("["+ans+","+ans1+"]");
    }

static  int[] SearchRAnge(int[] nums, int target){
   int[] ans = {-1 , -1}; 
   int start = Search(nums, target, true);
   ans[0] = start;
   int end = Search(nums, target, false);
   ans[1] = end;

    return ans;
   }


   static int Search(int[] num, int target, boolean startIndex){
    int ans = -1;
    int start = 0;
    int end = num.length - 1;

    while(start <= end){
        int mid = start + (end - start) / 2;
        if(target < num[mid]){
            end = mid - 1;
        }
        else if(target > num[mid]){
            start = mid + 1;

        }
        else {
           ans = mid;
            if(startIndex){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }

        }
        
    }
    return ans;
    
   }
}