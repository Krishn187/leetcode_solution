class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0 ) return true;
        boolean pre = false;
        boolean next = false;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
                pre =(i==0 || flowerbed[i-1]==0);
            next =(i==flowerbed.length-1||flowerbed[i+1]==0);
            if(pre && next){
                flowerbed[i]=1;
                n--;
            }
            }
                if(n==0) return true;
            }
        
        return  n<=0;
    }
}