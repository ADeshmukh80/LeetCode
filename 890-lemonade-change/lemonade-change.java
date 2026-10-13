class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten=0;
        for(int n:bills){
            if(n==5){
                five++;
            }
            else if(n==10){//return $5
                if(five>0){
                    five--;
                    ten++;
                }else{
                    return false;
                }
            }else if(five>0 && ten>0){//return $15
                five--;
                ten--;
            }else if(five>=3){//return 5,5,5
                five-=3;
            }
            else{
                return false;
            }
        }
        return true;
    }
}