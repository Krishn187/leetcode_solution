class Solution {
    public boolean checkString(String s) {
        int j=s.length()-1;
        while(j>0){
            char ch1 = s.charAt(j);
            char ch2 = s.charAt(j-1);
            if(ch1 =='a' && ch2=='b'){
                return false;
            }
            j--;
        }
        return true;
    }
}