import java.util.ArrayList;
import java.math.BigInteger;
class Solution {
    public String removeDigit(String number, char digit) {
        // ArrayList<BigInteger> lst = new ArrayList<BigInteger>();
        // for (int i = 0; i < number.length(); i++) {
        //     if(number.charAt(i) == digit){
        //         String result = "";
        //         result = number.substring(0, i) + number.substring(i + 1);
        //         lst.add(new BigInteger(result));
        //     }
        // }
        // System.out.println(lst);
        // BigInteger max = lst.get(0);
        // for(BigInteger i : lst){
        //     if(i.compareTo(max) > 0){
        //         max = i;
        //     }
        // }
        // return max.toString();
        String maxNumber = "";
        for (int i = 0; i < number.length(); i++) {
            if(number.charAt(i) == digit){
                String newNumber = number.substring(0, i) + number.substring(i + 1);

                if(newNumber.compareTo(maxNumber) > 0){
                    maxNumber = newNumber;
                }
            }
        }
        return maxNumber;
    }
}

public class RemoveDigit {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.removeDigit("1231", '1'));
    }    
}
