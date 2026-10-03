class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] fre = new int[101];
        for(int i=0;i<nums.length;i++){
            fre[nums[i]]++;
        }
        int pair =0;

        for(int i=0;i<fre.length;i++ ){
            int count = fre[i];
            if(fre[i]> 1){
                while(count>1){
                    pair += (count -1);
                    count--;
                }
            }
        }
        return pair;
    }
}