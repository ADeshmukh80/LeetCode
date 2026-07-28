class Solution {
    public int titleToNumber(String columnTitle) {
        int idx=0;
        for(char ch:columnTitle.toCharArray()){
            int i=ch-'A'+1;
            idx=idx*26+i;
        }
        return idx;
    }
}