class Solution {
    public int maxLength(int[] nums) {
        
        int max=0;
        for(int i=0;i<nums.length;i++){
            int prod=1;
            int lcm=1;
        int gcd=0;
        for(int j=i;j<nums.length;j++){
            prod=prod*nums[j];
            
            gcd=tgcd(gcd,nums[j]);
            lcm =(lcm*nums[j]) / tgcd(lcm,nums[j]);
            if(prod==lcm*gcd){
                max=Math.max(max,j-i+1);
            }

        }
        }
        return max;
    }static int tgcd(int a,int b){
        while(b!=0){
        int temp=b;
        b=a%b;
        a=temp;
    }
    return a;
    }
}