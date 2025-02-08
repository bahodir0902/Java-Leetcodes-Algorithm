import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public char findTheDifference(String s, String t) {
        // HashSet<Character> map = new HashSet<>();
        // for (int i = 0; i < t.length(); i++) {
        //     map.add(t.charAt(i));
        // }
        // System.out.println(map);
        // for (int i = 0; i < t.length() - 1; i++) {
        //     if(map.contains(s.charAt(i))){
        //         map.remove(s.charAt(i));
        //     }
        // } 
        // String ch = map.toString();
        // return ch.charAt(1);
        ArrayList<Character> arr = new ArrayList<>();
        for (int i = 0; i < t.length(); i++) {
            arr.add(t.charAt(i));
        }
        System.out.println(arr);
        for (int i = 0; i < s.length(); i++) {
            if(arr.contains(s.charAt(i))){
                arr.remove(arr.indexOf(s.charAt(i)));
            }
        }
        System.out.println(arr);
        Character ch = arr.get(0);
        return ch;
    }
}

public class FindDifference {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.findTheDifference("abcd", "abcde"));
    }
}
