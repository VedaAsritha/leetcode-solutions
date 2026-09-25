class Solution {
    public boolean isHappy(int n) {
       int sum=0,ld;
       while(n>9){
        while(n!=0){
             ld=n%10;
            sum+=ld*ld;
            n/=10;
            
        }
        n=sum;
        sum=0;
        
       }
       if(n==1||n==7) return true; 
       else return false;
    }}