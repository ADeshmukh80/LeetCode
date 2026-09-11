class Solution {
    public int totalNumbers(int[] digits) {
        int[] res=new int[10];
        int c=0;

        for(int i:digits){
            res[i]++;
        }

        for(int i=1;i<10;i++){
            for(int j=0;j<10;j++){
                for(int k=0;k<9;k+=2){
                    res[i]--;
                    res[j]--;
                    res[k]--;

                    if(res[i]>=0 && res[j]>=0 && res[k]>=0){
                        c++;
                    }
                    res[i]++;
                    res[j]++;
                    res[k]++;
                }
            }
        }
        return c;
    }
}