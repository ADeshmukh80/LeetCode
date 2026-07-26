class Solution {
    public int maxProduct(int n) {
        int large=0;
        int secLarge=0;

        while(n>0){
            int x=n%10;
            if(x>large){
                secLarge=large;
                large=x;
            }
            else if(x>secLarge){
                secLarge=x;
            }
            n/=10;
        }
        return large*secLarge;
    }
}