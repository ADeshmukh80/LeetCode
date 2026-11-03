class Solution {
    public int minMoves(int[] nums) {
        int max=0;
        int sum=0;
        for(int i:nums){
            max=Math.max(max,i);
            sum+=i;
        }
        return (nums.length*max)-sum;
    }
}