package Problems.Recursion.Reverse_String;

public class ReverseStringSolutionClass implements ReverseStringSolutionInterface {

    @Override
    public String reverse(String str) {
        return reverseString(str);
    }

    private String reverseString(String str) {
        // base case
        if (str.length() == 0) return "";

        // recursive call
        String recursive = reverseString(str.substring(1));

        // operation
        return recursive + str.charAt(0);

    }

}
