import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating {
    public static int lengthOfLongestSubstring(String s){
        int len = s.length();

        if(len == 0 || len == 1)
            return len;

        Set<Character> str = new HashSet<>();
        int max = 1;
        int start = 0;
        str.add(s.charAt(0));

        for(int i = start + 1; i < len; i++){
            char c = s.charAt(i);

            if(str.contains(c)){
                while(start < i){
                    char r = s.charAt(start);
                    str.remove(r);
                    start++;

                    if(r == c){
                        str.add(r);
                        break;
                    }
                }
            } else {
                str.add(c);
                int size = str.size();

                if(max < size)
                    max = size;
            }
        }
        return max;
    }
    public static void main(String[] args){
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
