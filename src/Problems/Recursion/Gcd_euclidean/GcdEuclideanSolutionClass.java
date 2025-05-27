package Problems.Recursion.Gcd_euclidean;

public class GcdEuclideanSolutionClass implements GcdEuclideanSolutionInterface{
    public int getGcd(int a, int b) {

        if (a==0 && b==0) {
            return 0;
        } else if (a==0) {
            return b;
        } else if (b==0) {
            return a;
        } else {
            if (a<0) {
                a *= -1;
            }
            if (b<0) {
                b *= -1;
            }
            return getGcdRecursively(a, b);
        }

    }

    private int getGcdRecursively(int a, int b) {

        // base case
        if (a%b == 0) {
            return b;
        }

        // recursion (tail, since b acts as the accumulated and is returned in the base case as result)
        return getGcdRecursively(b, a%b);

    }
}
