package Problems.Recursion.Reverse_String;

@FunctionalInterface
public interface ReverseStringRecursionInterface {
    /****
 * Recursively reverses a string using the provided interface instance.
 *
 * @param self the interface instance used for recursive calls
 * @param str the string to reverse
 * @return the reversed string
 */
String reverse(ReverseStringRecursionInterface self, String str);
}
