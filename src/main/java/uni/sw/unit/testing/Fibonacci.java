package uni.sw.unit.testing;

public class Fibonacci {
    public int getFibonacci(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        return getFibonacci(n-1) + getFibonacci(n-2);
    }
}
