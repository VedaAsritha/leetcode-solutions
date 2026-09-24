class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
      int res=0;
      while(k>0){
        if(numOnes>0) { res++;numOnes--;}
        else if(numZeros>0){ numZeros--;}
        else if(numNegOnes>0){ res--; numNegOnes--;}
        k--;
      }
      return res;
}
}