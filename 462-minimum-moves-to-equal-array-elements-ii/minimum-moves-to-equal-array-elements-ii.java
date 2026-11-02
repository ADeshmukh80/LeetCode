class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int mid=nums[n/2];
        long moves=0;
        for(int i:nums){
            moves+=Math.abs(i-mid);
        }
        return (int)moves;
    }
}