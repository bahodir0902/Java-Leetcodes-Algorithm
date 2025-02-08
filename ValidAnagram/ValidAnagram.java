import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.isEmpty() || t.isEmpty()){
            return false;
        }
        if(s.length() != t.length()){
            return false;
        }
        // HashMap<Character, Integer> t_freq = new HashMap<>();
        // HashMap<Character, Integer> s_freq = new HashMap<>();
        // for (int i = 0; i < t.length(); i++) {
        //     t_freq.put(t.charAt(i), t_freq.getOrDefault(t.charAt(i), 0) + 1);
        // }
        // for (int i = 0; i < s.length(); i++) {
        //     s_freq.put(s.charAt(i), s_freq.getOrDefault(s.charAt(i), 0) + 1);
        // }
        // System.out.println(t_freq);
        // System.out.println(s_freq);
        // for(Character ch_t : t_freq.keySet()){
        //     if(!s_freq.containsKey(ch_t)){
        //         return false;
        //     }
        // }
        ArrayList<Character> t_freq = new ArrayList<>();
        ArrayList<Character> s_freq = new ArrayList<>();
        for (int i = 0; i < t.length(); i++) {
            t_freq.add(t.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            s_freq.add(s.charAt(i));
        }
        System.out.println(t_freq);
        System.out.println(s_freq);
        for(Character ch : t_freq){
            if(!s_freq.contains(ch)){
                return false;
            }
            s_freq.remove(ch);
        }
        return true;
    }
}
public class ValidAnagram {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isAnagram("anagram", "nagaram"));
        System.out.println(sol.isAnagram("rat", "car"));
        System.out.println(sol.isAnagram("pool", "polo"));
        System.out.println(sol.isAnagram("ab", "a"));
    }
}
