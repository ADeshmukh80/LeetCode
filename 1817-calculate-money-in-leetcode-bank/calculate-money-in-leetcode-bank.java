class Solution {
    public int totalMoney(int n) {
        int start_mon=1;
        int res=0;
        while(n>0){
            int money=start_mon;
            for(int i=1;i<=Math.min(n,7);i++){
                res+=money;
                money++;
            }
            n=(n-7);
            start_mon++;
        }
        
        return res;
    }
}