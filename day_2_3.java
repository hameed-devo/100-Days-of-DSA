import java.util.*;
class Solution {
    public void nextPermutation(int[] nums) {
        int pvt=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pvt=i;
                break;
            }           
        }
        if(pvt==-1){
            ArrayList<Integer> list=new ArrayList<>();
            for(int val:nums){
                list.add(val);
            }
            Collections.reverse(list);
            for(int i=0;i<nums.length;i++){
                nums[i]=list.get(i);
            }
            list.clear();
             return;
        }
        for(int i=n-1;i>pvt;i--){
            if(nums[i]>nums[pvt]){
                int temp=nums[pvt];
                nums[pvt]=nums[i];
                nums[i]=temp;
                break;
            }
           
        }
        int start=pvt+1,end=n-1;
        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}