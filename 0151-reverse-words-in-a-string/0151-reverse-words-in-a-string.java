class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            // if(s.matches("[a-zA-Z]+")) continue;
             sb.append(arr[i]);
            if(i > 0){
               
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}