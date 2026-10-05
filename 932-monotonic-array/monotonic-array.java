class Solution {
    public boolean isMonotonic(int[] nums) {
        int dir=0;
        int n=nums.length;
        for(int i=1;i<n;i++){
             if(nums[i]>nums[i-1]) {
                if(dir==0) dir=1;
                else if(dir==-1) return false;
             }
                else if(nums[i]<nums[i-1]){
                    if(dir==0) dir=-1;
                    else if(dir==1) return false;
                }
             }
        return true;}
    }
