class Solution {
    public int findNumbers(int[] nums) {
        int res=0,cnt;
        for(int a:nums){
            cnt=0;
            while(a!=0){
                int b=a%10;
                cnt++;
                a/=10;

            }
            if(cnt%2==0) 
            res++;
        }
        return res;
    }
    
}