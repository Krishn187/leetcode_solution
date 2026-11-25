class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int line =1,wOl=0,currw=0;
        for(int i=0;i<s.length();i++){
            
            char ch = s.charAt(i);
            if(currw + widths[ch-'a'] <= 100){
                currw += widths[ch-'a'];
            }else{
                line ++;
                currw = widths[ch-'a'];
            }
            wOl = currw;
        }
        int[] ans = new int[2];
        ans[0]=line;
        ans[1]=wOl;
        return ans;
    }
}