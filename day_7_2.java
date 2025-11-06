
class Solution {
    static boolean pairInSortedRotated(int arr[], int target) {
        for(int i=0;i<arr.length;i++){
            int sec=target-arr[i];
            int start=0;
            int n=arr.length;
            int end=n-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(arr[mid] == sec){
                    if(mid != i) return true;
                }
                 if(arr[start]==arr[mid] && arr[mid]==arr[end]){
                    start++;
                    end--;
                }
                else if(arr[mid]>=arr[start]){
                    if(arr[start]<=sec && sec<arr[mid]){
                        end=mid-1;
                    }
                    else{
                        start=mid+1;
                    }
                }
                else{
                    if(arr[mid]<sec && sec<=arr[end]){
                        start=mid+1;
                    }
                    else{
                        end=mid-1;
                    }
                }
            }
}
return false;
}
}
