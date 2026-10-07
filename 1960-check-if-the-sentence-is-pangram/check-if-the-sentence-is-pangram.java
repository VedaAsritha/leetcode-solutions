class Solution {
    public boolean checkIfPangram(String s) {
        int n=s.length();
        for (char ch='a';ch<='z';ch++){
             int f=0;
        for(int i=0;i<n;i++){
            if(ch==s.charAt(i)){ f=1; break;}
        }
                if(f==0) return false;} return true;
    }
}