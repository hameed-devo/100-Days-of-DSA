
import java.util.*;

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        int n = arr.size();
        if (m == 0 || n == 0)
            return 0;
        Collections.sort(arr);
        if (n < m)
            return -1;
        
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i + m - 1 < n; i++) {
            int diff = arr.get(i + m - 1) - arr.get(i);
            if (diff < minDiff)
                minDiff = diff;
        }
        
        return minDiff;
    }
}
