class Solution {
    public int numberOfMatches(int n) {
        int res=n,mat=0;
        while(res!=1){
            if(res%2==0) {mat+=res/2; res=res/2;}
            else{ mat+=(res-1)/2; res=((res-1)/2 )+1;}
        
        }
        return mat;

    }
}