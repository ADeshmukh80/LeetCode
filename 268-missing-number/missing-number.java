class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int l=0;
        int r=nums.length-1;

        while(l<=r){
            int mid=l+(r-l)/2;

            if(mid==nums[mid]){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return l;
    }
}