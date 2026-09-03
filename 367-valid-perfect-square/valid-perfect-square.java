class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<0){
            return false;
        }
        if(num==0 || num==1){
            return true;
        }
        
        int l=1;
        int r=num;
        while(l<=r){ 
            int mid=l+(r-l)/2;
            long sqr=(long)mid*mid;
            if(sqr==num){
                return true;
            }
            else if(sqr<num){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return false;
    }
}