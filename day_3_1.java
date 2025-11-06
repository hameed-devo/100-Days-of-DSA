import java.util.HashSet;
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> seen=new HashSet<>();
        int repeated=0;
        int n=grid.length;
        for(int[] rows:grid){
            for(int val:rows){
                if(seen.contains(val)){
                    repeated=val;
                }
                else{
                    seen.add(val);
                }
            }
        }
        int missingno=0;;
        for(int i=1;i<=n*n;i++){   
            if(!seen.contains(i)){
                missingno=i;
                break;
            }
        }
        int[] arr={repeated,missingno};
        return arr;
    }
}