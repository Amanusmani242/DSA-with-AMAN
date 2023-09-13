package BinarySearch;
import java.util.Scanner;

public class BinaryS {
    public static void main(String[] args) {
        int[] arr = { 60, 53, 39, 21, 11, 3, 1 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target to be searched:");
        int target = sc.nextInt();

        int ans = binarySearch(arr, target);
        System.out.println("The index of target is:" + ans);
        System.out.println("The target is:" + arr[ans]);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = (arr[start] < arr[end]);

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;

                } else if (target > arr[mid]) {
                    start = mid + 1;
                }

            }

            else {
                if (target > arr[mid]) {
                    end = mid - 1;

                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }

        }
        return -1;

    }
}
