import java.util.HashSet;
import java.util.Set;

public class LeetCode3 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> strings = new HashSet<>();
        int count = 0;
        for(int i = 0;i<s.length();i++){
            if(strings.contains(s.charAt(i))){
                i-=strings.size();
                strings.clear();
            }
            else {
                strings.add(s.charAt(i));
                if(count<strings.size())
                    count = strings.size();
            }
        }
        return count;
    }
}
