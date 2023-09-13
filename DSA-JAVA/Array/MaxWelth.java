public class MaxWelth {
    public static void main(String[] args) {
        int [][] acounts = {{1,5},
                            {7,3},
                            {3,5}  };
      System.out.println(maximumWelth(acounts));  
        
    }

    static int maximumWelth(int[][] acounts){
        int ans = Integer.MIN_VALUE;
        for(int person = 0; person < acounts.length; person++){
            int sum = 0;
            for(int account = 0; account < acounts[person].length; account++){
                sum = sum + acounts[person][account];


            }
            if(sum > ans){
                ans = sum;
            }
            
        }
        return ans;
        
    }
    
}
