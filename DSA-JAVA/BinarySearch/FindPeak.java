package BinarySearch;
//162. Find Peak Element(leetCode)
public class FindPeak {
    public static void main(String[] args) {

        int[] nums = {0, 2, 1, 0};
        int ans = PeekNum(nums);
        System.out.println("The maximum number in the array is at position:"+ ans);
        System.out.println("The maximum number in the array is:" + nums[ans]);

    }

    static int PeekNum(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }

        }
        return start;// or end because end and start will be pointing to same position at the end

    }
}
