import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> lst = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if(i % 3 == 0 && i % 5 != 0){
                lst.add("Fizz");
            }else if(i % 3 != 0 && i % 5 == 0){
                lst.add("Buzz");
            }else if(i % 3 != 0&& i % 5 != 0){
                lst.add(Integer.toString(i));
            }else if(i % 3 == 0 && i % 5 == 0){
                lst.add("FizzBuzz");
            }
        }
        return lst;
    }
}

public class FizzBuzz {
    public static void main(String[] args) {
        Solution sol = new Solution();
        List<String> lst = new ArrayList<String>();
        lst =  sol.fizzBuzz(15);
        System.out.println(lst);
    }   
}
