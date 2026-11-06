class Solution {
    public int minMoves(int[] nums) {
        int goat = 0;
        for(int i=0;i<nums.length;i++){
            goat = Math.max(goat,nums[i]);
        }
        int sum =0;
        for(int i=0;i<nums.length;i++){
            sum += (goat-nums[i]);
        }
        return sum;
    }
}