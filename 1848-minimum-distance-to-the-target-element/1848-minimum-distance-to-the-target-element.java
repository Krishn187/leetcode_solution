class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        List<Integer> l1 = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]== target){
                l1.add(i);
            }
        }
       int min =Integer.MAX_VALUE;
            for(int i : l1){
                min = Math.min(min , Math.abs(i-start));
            }
       
        return min;
    }
}