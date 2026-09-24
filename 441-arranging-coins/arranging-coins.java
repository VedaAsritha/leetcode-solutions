class Solution {
    public int arrangeCoins(int n) {
        int row=0;
        int need=1;
        while(n>=need){
            row++;
            n=n-need;
            need++;
        }
        return row;

        }
    }
