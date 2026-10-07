class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] arr= new int[nums.length];
        int n=nums.length;
        int left=0,right=n-1;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){ arr[left]=nums[i]; left++;}
            else{ arr[right]=nums[i]; right--;}
        }
    return arr;}
}