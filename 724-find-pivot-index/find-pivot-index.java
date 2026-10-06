class Solution {
    public int pivotIndex(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            int lsum=0,rsum=0;
            for(int j=0;j<n;j++){
            if(j<i) lsum+=arr[j];
            else if(j>i) rsum+=arr[j];}
               
        if(lsum==rsum) return i;        }
        return -1;
    }
}