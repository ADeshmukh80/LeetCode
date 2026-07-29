class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer>st=new HashSet<>();
        int[] res=new int[2];
        int j=0;
        for(int i:nums){
            if(st.contains(i)){
                res[j++]=i;
            }
            else{
                st.add(i);
            }
        }
        return res;
    }
}