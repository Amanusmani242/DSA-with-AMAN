package BinarySearch;
//410. Split Array Largest Sum(LeetCode)
public class SplitArrayLargestSum {
public static void main(String[] args) {
    int[] nums ={7,2,5,10,8};
    int m = 1;
    int ans = SplitArray(nums, m);
    System.out.println(ans);
    
}
static int SplitArray(int[] nums, int m){
int start = 0;
int end = 0;

for(int i = 0; i < nums.length; i++){
    start = Math.max(start, nums[i]);
    end = end + nums[i];
}

while(start < end){
    int mid = start + (end - start) / 2;

    int peices = 1;
    int sum =0;

    for(int num : nums){
        if(sum + num > mid){
            sum = num;
            peices++;
        }
        else{
            sum = sum + num;
        }    
    }
    
        if(peices > m){
            start = mid + 1;
        }
        else{
            end = mid;
        }
}
   return start;// or end
}

}
