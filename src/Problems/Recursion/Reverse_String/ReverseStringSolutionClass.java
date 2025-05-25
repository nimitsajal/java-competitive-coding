package Problems.Recursion.Reverse_String;

public class ReverseStringSolutionClass implements ReverseStringSolutionInterface {

    /**
     * Returns the reversed version of the given string.
     *
     * @param str the string to reverse
     * @return the reversed string
     */
    @Override
    public String reverse(String str) {
        return reverseString(str);
    }

    /****
     * Recursively reverses the input string.
     *
     * @param str the string to reverse
     * @return the reversed string
     */
    private String reverseString(String str) {
        // base case
        if (str.length() == 0) return "";

        // recursive call
        String recursive = reverseString(str.substring(1));

        // operation
        return recursive + str.charAt(0);

    }

}
