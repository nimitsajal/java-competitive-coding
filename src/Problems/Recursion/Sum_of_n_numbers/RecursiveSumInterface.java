package Problems.Recursion.Sum_of_n_numbers;

@FunctionalInterface
interface RecursiveSumInterface {
    int getSum(RecursiveSumInterface self, int n);
}
