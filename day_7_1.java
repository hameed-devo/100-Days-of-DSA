class Solution {
    public int maxArea(int[] height) {
        int maxarea=0;
        int n=height.length;
        int left=0;
        int right=n-1;
        
        while(left<right){
            int area=(right-left)*Math.min(height[left],height[right]);
            maxarea=Math.max(maxarea,area);
            if(height[left]<height[right]){
                left++;
            }
            else if(height[left]>height[right]){
                right--;
            }
            else{
                right--;
            }
        }
        return maxarea;
    }
}