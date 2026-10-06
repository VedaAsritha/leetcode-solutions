class Solution {
    public int thirdMax(int[] arr) {
        int n=arr.length;
        long max=Long.MIN_VALUE;
        long smax=max,tmax=max;
        for(int i=0;i<n;i++){
            if(arr[i]>max){ tmax=smax; smax=max; max=arr[i];}
            else if(arr[i]>smax && arr[i]!=max){ tmax=smax; smax=arr[i];}
            else if(arr[i]>tmax && arr[i]!=smax && arr[i]!=max) {tmax=arr[i];}
        } return tmax!=Long.MIN_VALUE?(int) tmax:(int)max;
    }
}