import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length())
            return false;

        char [] sChar = s.toCharArray();
        char [] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        return Arrays.equals(sChar, tChar);
    }
    public static void main(String[] args){
        String s = "KAI";
        String t = "KIA";
        System.out.println(isAnagram(s,t));
    }
}
