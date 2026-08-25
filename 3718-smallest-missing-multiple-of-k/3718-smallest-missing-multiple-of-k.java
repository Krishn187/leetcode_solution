class Solution {
    public int missingMultiple(int[] nums, int k) {
        int i=1;
        while(true){
            if(found(nums,k*i)==-1){
                return k*i;
            }
            i++;
        }
       
    }
    public int found(int[] nums , int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}