public class MaxNum{
    public static void main(String[] args) {
        int [] arr = {10,23,30,18,50};
        max(arr);
        System.out.println(max(arr));
        
    }

    static int max(int[] a)
    {
        int maxVal = a[0];
        for(int i = 1; i<a.length;i++){
            if(a[i] > maxVal){
                maxVal = a[i];
            }
        }
        return maxVal;


    }
}