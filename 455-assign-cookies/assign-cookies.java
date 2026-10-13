class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n=g.length;
        int m=s.length;
        int l=0,r=0;
        Arrays.sort(s);
        Arrays.sort(g);

        while(l<m && r<n){
            if(g[r]<=s[l]){
                r+=1;
            }
            l+=1;
        }
        return r;
    }
}