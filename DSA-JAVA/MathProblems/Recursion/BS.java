package Recursion;

public class BS {
    public static void main(String[] args) {
        int[] nums = {1, 2, 7, 9, 32, 40};
        int ans = BinarySearch(nums, 7, 0, nums.length - 1);
        System.out.println(ans);
        
    }
    static int BinarySearch(int[] nums, int target, int start, int end){
        if(start > end){
            return -1;
        }

        int mid = start + (end - start) / 2;

        if(nums[mid] == target){
            return mid;
        }
        if(target < nums[mid]){
            return BinarySearch(nums, target, start,mid - 1);
        }
        return BinarySearch(nums, target, mid + 1, end);
    }
}
