class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int res=0;
        while(mainTank>=5){
            int fuel=5;
            mainTank-=fuel;
            res+=50;
            if(additionalTank!=0){ mainTank++; additionalTank--;}
   

    }
        res+=mainTank*10;
        return res;
    }}
    