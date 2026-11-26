class Solution {
    public boolean canAliceWin(int n) {
        return win(n,0,10);
    }
    public boolean win(int n, int turn,int num){
        if(n<num && turn ==1){
            return true;
        }
        if(n<num && turn ==0){
            return false;
        }
        return win(n-num,(turn+1)%2,num-1);
    }
}