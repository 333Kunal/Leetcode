public class RemoveConsecutiveCharacters {
    public static String removeConsecutiveDuplicates(String input){
        if(input.length() <= 1)
            return input;
        if(input.charAt(0)==input.charAt(1))
            return removeConsecutiveDuplicates(input.substring(1));
        else
            return input.charAt(0) + removeConsecutiveDuplicates(input.substring(1));
    }
    public static void main(String[] args){
        String s1 = "geeksforgeeks";
        System.out.println(removeConsecutiveDuplicates(s1));

        String s2 = "aabcca";
        System.out.println(removeConsecutiveDuplicates(s2));
    }
}
