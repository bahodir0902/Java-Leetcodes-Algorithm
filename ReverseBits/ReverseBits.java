class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String str_int = Integer.toString(n);
        String reverse_str = "";
        for (int i = str_int.length(); i > 0; --i) {
            reverse_str += str_int.charAt(i - 1);
        } 
        int dec_value = 0;
        for (int i = 0; i < reverse_str.length(); ++i) {
            dec_value += Integer.parseInt(reverse_str.charAt(i) + "") * Math.pow(2, reverse_str.length() - i - 1);
        }
        return dec_value;
    }
}

public class ReverseBits {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.reverseBits(011));
    }
}
