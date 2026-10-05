class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int n=timeSeries.length;
        int total=0;
        for(int i=0;i<=n-2;i++){
            int x=timeSeries[i+1]-timeSeries[i];
            if(x<duration) total+=x;
            else total+=duration;
        }
        total+=duration;
        return total;
    }
}