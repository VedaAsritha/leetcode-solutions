class Solution {
    public int[] runningSum(int[] arr) {
        int n=arr.length,sum=arr[0];
        for(int i=1;i<n;i++){
              arr[i]+=sum;
              sum=arr[i];
        } 
        return arr;
    }
}