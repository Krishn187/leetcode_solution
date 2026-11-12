class Solution {
    public int[] rearrangeArray(int[] nums) {
        // Arrays.sort(nums);
         int ans[]= new int[nums.length];
        // int k=0;
        // List<Integer> l1 = new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     l1.add(nums[i]);
        // }
        // while(l1.size()>0){
        //     int j=0;
        //     while(j<l1.size()-1){
        //         if(l1.get(j)<l1.get(j+1)){
        //             ans[k++]=l1.get(j);
        //             l1.remove(j);
        //         }
        //         j++;
        //     }
        // }
        // return ans;
        int fre[] = new int[101];
        int k=0;
        for(int i=0;i<nums.length;i++){
            fre[nums[i]]++;
        }
        while(k<nums.length){
            int i=0;
            while(i<fre.length){
                if(fre[i]>0){
                    ans[k++]=i;
                    fre[i]--;
                }
                i++;
            }
        }
        return ans;
    }
}