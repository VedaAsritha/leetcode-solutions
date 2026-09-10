class Solution {
    public boolean canAliceWin(int[] nums) {
        int sds=0,dds=0;
        for(int a:nums){
            if(a<=9) sds+=a;
            else dds+=a;
        }
    
    if(sds!=dds) return true;
    else return false;
}}