import java.util.HashSet;

class Solution {
    int square(int num){
        int result = 0;
        while(num > 0){
            int temp = (int) Math.pow( num % 10, 2);
            num /= 10;
            result += temp;
        }
        return result;
    }

    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        do{
            set.add(n);
            int temp = square(n);
            System.out.println(temp);
            n = temp;
            if(n == 1){
                return true;
            }
            if(set.contains(n)){
                return false;
            }
        }while(n != 0);
        
        return false;

    }
}

public class isHappy {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isHappy(2));
    }    
}
