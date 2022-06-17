import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LeetCode5 {
    public static String longestPalindrome(String s) {
        String factory = "";
        String result = "";
        for(int i=0;i<s.length();i++){
            if(factory.contains(s.charAt(i))){

                strings.push(s.charAt(i));
                for(Character c: strings){
                    result += c.toString();
                }
                return result;
            }
            else
                strings.push(s.charAt(i));
        }
        return null;
    }

    public static void main(String[] args) {
//        System.out.println(longestPalindrome("cbbd"));
    }
}
