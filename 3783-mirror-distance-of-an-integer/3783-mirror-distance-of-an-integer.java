class Solution {
    public int mirrorDistance(int n) {
        return Math.abs(n-reverse(n));
    }
    public int reverse(int a){
        int n = 0;
        while(a>0){
            int d = a %10;
            n = n*10 + d;
            a /= 10;
        }
        return n;
    }
}