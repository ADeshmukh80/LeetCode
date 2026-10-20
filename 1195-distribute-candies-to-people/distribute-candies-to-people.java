class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] res=new int[num_people];
        int curr=1;
        while(candies>0){
            for(int i=0;i<num_people;i++){
            if(candies>=curr){
                res[i]+=curr;
                candies-=curr;
                curr++;
            }else{
                res[i]+=candies;
                candies=0;
            }
        }
        }
        return res;
    }
}