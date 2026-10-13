class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int c=0,l=0,r=0;
        int n=players.length,m=trainers.length;
        while(l<n && r<m){
            if(players[l]<=trainers[r]){
                c++;
                l++;
                r++;
            }else{
                r++;
            }
        }
        return c;
    }
}