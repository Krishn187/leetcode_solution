class Solution {
    
    public int jump(int[] arr) {
        int n= arr.length;
        if(n==1) return 0;
        int jump =0;
        int currEnd = 0;
        int far =0;
        for(int i=0;i<arr.length;i++){
            far = Math.max(far, i+ arr[i]);
            if(currEnd==i){
                jump++;
                currEnd = far;
            }

            if(currEnd >= n-1){
                break;
        }
        }
        return jump;
    }
}