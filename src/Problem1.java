/**
 * @author eguchi
 */
public class Problem1 {

    public static void main(String[] args) {
        Problem1 problem1 = new Problem1();

        System.out.println(problem1.execute(3, 5, 1000));
    }

    public int execute(int a, int b, int max) {
        max--;
        int commonMulti = a * b;
        return sum(a, max) + sum(b, max) - sum(commonMulti, max);
    }

    private int sum(int n, int max) {
        int num = max / n;
        return (n + n * num) * num / 2;
    }
}
