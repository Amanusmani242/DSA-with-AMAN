package Sorting.CyclicSort;
//41. First Missing Positive(LeetCode)

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        int ans = firstMissingPositive(nums);
        System.out.println(ans);
        
    }
    
   static int firstMissingPositive(int[] nums) {
    int i = 0;
    while( i < nums.length){
        int correctIndex = nums[i] - 1;
        if( nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctIndex]){
            swap(nums, i, correctIndex);
        }
        else{
            i++;
        }
    }
    for(int index = 0; index < nums.length; index++){
        if(nums[index] != index + 1){
            return index + 1;
        }
    }
    return nums.length + 1;
        
    }
    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
