public class SmallestEvenMultiple2413 {
    public int smallestEvenMultiple(int n) {
        if (n == 1) {
            return 2;
        }
        if (n % 2 == 1) {
            return 2 * n;
        }
        return Math.max(2, n);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(new SmallestEvenMultiple2413().smallestEvenMultiple(n));
    }
}
