class Solution {
    public String reverseParentheses(String s) {
        char[] arr = s.toCharArray();

        while (true) {
            int close = -1;
            int open = -1;

            
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == ')') {
                    close = i;
                    break;
                }
            }

           
            if (close == -1) {
                break;
            }

           
            for (int i = close - 1; i >= 0; i--) {
                if (arr[i] == '(') {
                    open = i;
                    break;
                }
            }

            
            reverse(arr, open + 1, close - 1);

           
            arr[open] = ' ';
            arr[close] = ' ';
        }

        StringBuilder sb = new StringBuilder();

        for (char c : arr) {
            if (c != ' ') {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void reverse(char[] arr, int i, int j) {
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
}