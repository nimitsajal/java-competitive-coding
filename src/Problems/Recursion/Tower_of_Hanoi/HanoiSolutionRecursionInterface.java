package Problems.Recursion.Tower_of_Hanoi;

import java.util.concurrent.atomic.AtomicInteger;

@FunctionalInterface
public interface HanoiSolutionRecursionInterface {
    void solve(HanoiSolutionRecursionInterface self, int n, char s, char m, char d, AtomicInteger moveCounter);
}
