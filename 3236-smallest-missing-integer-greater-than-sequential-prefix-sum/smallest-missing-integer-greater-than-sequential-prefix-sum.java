class Solution {
    public int missingInteger(int[] nums) {
        int n=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                n+=nums[i];
            }
            else{
                break;
            }
        }
        HashSet<Integer>st=new HashSet<>();
        for(int j:nums){
            st.add(j);
        }
        while(st.contains(n)){
            n++;
        }
        return n;
    }
}