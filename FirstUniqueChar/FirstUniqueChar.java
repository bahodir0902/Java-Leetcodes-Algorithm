import java.util.LinkedHashMap;

class Solution {
    public int firstUniqChar(String s) {
        // int len = s.length();
        // int freq = 0;
        // HashMap<Character, Integer> map = new HashMap<>();
        // for (int i = 0; i < len; i++) {
        //     //map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        //     freq = 0;
        //     for (int j = 1; j < len; j++) {
        //         if(s.charAt(i) != s.charAt(j)){
        //             ++freq;
        //         }
        //         if(freq == len - i - 1){
        //             System.out.println(s.charAt(i));
        //             return i;
        //         }
        //     }
        // }
        // return -1;

        int len = s.length();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap();
        for (int i = 0; i < len; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        int i = 0;
        System.out.println(map);
        for(Character c : map.keySet()){
            if(map.get(c) == 1){
                return s.indexOf(c);
            }
            ++i;
        }
        return -1; 
    }
}

public class FirstUniqueChar {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.firstUniqChar("dddccdbba"));
    }
}
