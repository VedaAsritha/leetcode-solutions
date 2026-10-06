class Solution(object):
    def thirdMax(self, arr):
        
        arr=sorted(set(arr))
        n=len(arr)
        if(n<3):
            return max(arr)
        return arr[n-3]
        