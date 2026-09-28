class Solution {
    public int maxDepth(String s) {
        int d=0;
        int r=0;
        for(char c:s.toCharArray()){
            if(c==')'){
                d--;
                continue;
            }
            if(c!='('){
                continue;
            }
            d++;
            if(d>r){
                r=d;
            }
        }
        return r;
    }
}