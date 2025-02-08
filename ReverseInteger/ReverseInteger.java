class Solution {
    public int reverse(int x) {
        if(x == 0){
            return x;
        }
        String value = Integer.toString(x);
        StringBuilder result = new StringBuilder();
        if(value.charAt(value.length() - 1) == '0' && value.charAt(0) != '-'){
            for (int i = value.length() - 2; i >= 0; --i) {
                result.append(value.charAt(i));
            }
        }else if(value.charAt(value.length() - 1) == '0' && value.charAt(0) == '-'){
            result.append('-');
            for (int i = value.length() - 2; i > 0; --i) {
                result.append(value.charAt(i));
            }
        }else if(value.charAt(value.length() -1) != '0' && value.charAt(0) == '-'){
            result.append('-');
            for (int i = value.length() - 1; i > 0; --i) {
                result.append(value.charAt(i));
            }
        }else{
            for (int i = value.length() - 1; i >= 0; --i) {
                result.append(value.charAt(i));
            }
        }
        try{
            return Integer.parseInt(result.toString());
        }catch (NumberFormatException e){
            return 0;
        }
        

    }
}
public class ReverseInteger {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.reverse(-120));
    }
}
