public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] arr) {
        int n=arr.length;
        int actualsum=0;
        int actualsqsum=0;
        int expectedsum=n*(n+1)/2;
        int expectedsqsum=n*(n+1)*((2*n)+1)/6;
        for(int val:arr){
            actualsum+=val;
            actualsqsum+=val*val;
        }
        int diff=actualsum-expectedsum;
        int sumxy=(actualsqsum-expectedsqsum)/diff;
        int x=(diff+sumxy)/2;
        int y=x-diff;
        return new int[]{x,y};
        
    }
}
