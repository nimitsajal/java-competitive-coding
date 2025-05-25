package Problems.Recursion.Reverse_String;

import java.util.Objects;

public class ReverseStringTest {

    static ReverseStringSolutionInterface solutionClass = new ReverseStringSolutionClass();

    static ReverseStringSolutionInterface solutionLambda = (String str) -> {
        ReverseStringRecursionInterface recursive = (ReverseStringRecursionInterface self, String inputStr) ->
                inputStr.length() == 0 ? "" : self.reverse(self, inputStr.substring(1)) + inputStr.charAt(0);
        return recursive.reverse(recursive, str);
    };

    public static void main(String[] args) {

        String[][] inputs = {
                {"abcd", "dcba"},
                {"nimit", "timin"},
                {"", ""},
                {"a", "a"},
                {"racecar", "racecar"},
                {"Hello, World!", "!dlroW ,olleH"},
                {"12345", "54321"},
                {"OpenAI", "IAnepO"},
                {"   ", "   "},         // only spaces
                {"a b c", "c b a"},
                {"@ChatGPT!", "!TPGtahC@"},
                {"Was it a car or a cat I saw?", "?was I tac a ro rac a ti saW"}
        };


        runTests(solutionClass, inputs);
        runTests(solutionLambda, inputs);

    }

    static void runTests(ReverseStringSolutionInterface solution, String[][] inputs) {

        boolean allTestsPassed = true;

        System.out.println("----- " + solution.getClass().getSimpleName() + " -----");

        for (int i=0; i<inputs.length; i++) {
            String str = inputs[i][0];
            String expectedOutput = inputs[i][1];

            long startTime = System.nanoTime();
            String result = solution.reverse(str);
            long endTime = System.nanoTime();

            if (Objects.equals(result, expectedOutput)) {
                System.out.println("Test " + (i + 1) + " passed ✅");
                System.out.println("Input String: " + str + ", Expected: " + expectedOutput + ", and got: " + result);
                System.out.println("Execution Time: " + (endTime - startTime) + " ns\n");
            } else {
                System.out.println("Test " + (i + 1) + " failed ❌");
                System.out.println("Input String: " + str + ", Expected: " + expectedOutput + ", but got: " + result);
                System.out.println("Execution Time: " + (endTime - startTime) + " ns\n");
                allTestsPassed = false;
            }
        }

        if (allTestsPassed) {
            System.out.println("All tests passed! 🎉\n\n");
        } else {
            System.out.println("Some tests failed.\n\n");
        }
    }

}
