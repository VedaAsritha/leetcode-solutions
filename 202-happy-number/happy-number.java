class Solution {
    public boolean isHappy(int n) {
       int  sum=0;
int r,temp=n;
while(n>9)
{
    while(n!=0)
    {
    r=n%10;
    sum+=r*r;
    n=n/10;
    }
    n=sum;
    sum=0;
}
if(n==1||n==7)
return true;
else return false;  
} 
    }
