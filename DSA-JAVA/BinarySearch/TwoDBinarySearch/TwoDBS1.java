package TwoDBinarySearch;

import java.util.Arrays;

public class TwoDBS1 {
    public static void main(String[] args) {
         int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9 , 10, 11, 12},
            {13, 14, 15, 16}
        };
        System.out.println(Arrays.toString(twoDBS(matrix, 4)));
        
    }
    static int[] twoDBS(int[][] matrix, int target){
        int row = 0;
        int col = matrix.length - 1;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == target){
                return new int[] {row,col};
            }
            if(target > matrix[row][col]){
                row++;
            }
           else{
            col-- ;
           }
        }
        return new int[] {-1, -1};
    }
}
