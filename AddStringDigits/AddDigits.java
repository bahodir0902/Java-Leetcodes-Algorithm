class Solution {
    public String addStrings(String num1, String num2) {
        /*int n = num1.length();
        int m = num2.length();
        String result = "";
        if(m >= n){
            int end_index_2 = m - 1;
            int end_index_1 = n - 1;
            while(end_index_1 >= 0 && end_index_2 >= 0){
                result += Integer.parseInt(num2.charAt(end_index_2--) + "") + Integer.parseInt(num1.charAt(end_index_1--) + "");
            }
            if(end_index_2 >= 0){
                while(end_index_2 >= 0){
                    result += Integer.parseInt(num2.charAt(end_index_2--) + ""); 
                }
            }   
        }else{
            int end_index_2 = m - 1;
            int end_index_1 = n - 1;
            while(end_index_1 >= 0 && end_index_2 >= 0){
                result += Integer.parseInt(num2.charAt(end_index_2--) + "") + Integer.parseInt(num1.charAt(end_index_1--) + "");
            }
            if(end_index_1 >= 0){
                while(end_index_1 >= 0){
                    result += Integer.parseInt(num1.charAt(end_index_1--) + ""); 
                }
            }   
        }
        String res = "";
        for (int i = result.length() - 1; i >= 0; --i) {
            res += result.charAt(i);
        }
        return res;*/
        int n = num1.length() - 1;
        int m = num2.length() - 1;
        int carry = 0;
        String result = "";
        while(n >= 0 || m >= 0 || carry > 0){
            int digit1 = 0;
            int digit2 = 0;
            if(n >= 0){
                digit1 = num1.charAt(n--) - '0';
            }
            if(m >= 0){
                digit2 = num2.charAt(m--) - '0';
            }
            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            result += sum % 10;
        }
        String res = "";
        for (int i = result.length() - 1; i >= 0; --i) {
            res += result.charAt(i);
        }
        return res;
    }
}

public class AddDigits {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.addStrings("799", "1"));
    }
}
