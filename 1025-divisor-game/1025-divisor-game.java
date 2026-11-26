class Solution {
    public boolean divisorGame(int n) {
        int turn =0;
         while(true){
            if(n==1&& turn ==0){
                return false;
            }
            if(n==1 && turn ==1){
                return true;
            }
            if(n>1){
                n=n-1;
                turn = (turn+1)%2;
            }
            
         }
         
    }
}