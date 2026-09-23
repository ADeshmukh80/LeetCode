class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        int mini=Integer.MIN_VALUE;
        HashSet<Integer>st=new HashSet<>();
        for(int i:candyType){
            st.add(i);
        }
        int unique=st.size();
        mini =Math.min(unique,n/2);

        return mini;
    }
}