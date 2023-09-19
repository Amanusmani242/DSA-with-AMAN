package BinarySearch;
//33. Search in Rotated Sorted Array(LeetCode)

public class RBS {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 7, 0, 5, 6};
        int ans = Pivot(arr);
        System.out.println("The pivot element  in this array is "+ans);
        int finalAns = ANS(arr, 0);
        System.out.println("at "+ finalAns +" position the given target is present");
        
        
        
    }
    static int Pivot(int[] nums){
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            
            if(mid < end && nums[mid] > nums[mid + 1]){

                return mid;
            }
            if(mid > start &&  nums[mid] < nums[mid - 1]  ){
                return mid - 1;
            }
            else if(nums[start] >= nums[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;

            }
        }
        return -1;
    }
    static int BinarySearch(int[] nums, int target,int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < nums[mid]){
                end = mid - 1;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;

    }

    static int ANS(int[] nums, int target){    
        int Pivot  = Pivot(nums);
        if(Pivot == -1){   //pivot not found because array is not rotated array
            return BinarySearch(nums, target, 0, nums.length - 1);
        }
        //pivot found 3 cases
        //case 1: if pivot itself is target
        if(nums[Pivot] == target){  
            return Pivot;
        }
        //case 2:if target is greater then start(nums[0]) then my target is present b/w start to pivot - 1;
        else if(target >= nums[0]){
            return BinarySearch(nums, target, 0, Pivot - 1);
        }
        //case 3:target will be present b/w pivot + 1 till last of the array
        else{
            return BinarySearch(nums, target, Pivot + 1, nums.length - 1);
        }

        

    }
    
}
