class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res=0;
        while(numBottles>=numExchange){
            int temp=numExchange;
            res+=temp;
            numBottles-=temp;
            numBottles++;
        }
        return res+numBottles;
    }
}