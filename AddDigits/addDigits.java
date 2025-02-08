class Solution {
    public int sum(int num){
        int result = 0;
        while(num > 0){
            result += num % 10;
            num /= 10;             
        }
        //System.out.println(result);
        return result;
    }

    public int addDigits(int num) {
        int result = 0;
        do{
            result = sum(num);
            num = result;
        }
        while(Integer.toString(result).length() != 1);

        return result;
    }
}

public class addDigits {
    public static void main(String[] args){
        Solution sol = new Solution();
        System.out.println(sol.addDigits(192));
    }
}
