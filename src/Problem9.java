/**
 * @author eguchi
 */
public class Problem9 {
    public static void main(String[] args) {
        Timer.start();
        Problem9 problem = new Problem9();
        System.out.println(problem.execute(1000));
        Timer.stop();
    }

    public int execute(int num) {
        int a = 1, b, c;

        for (c = num - 3; c > 2; c--) {
            for (b = num - c - 1; b > a; b--) {
                a = num - c - b;
                if (test(a, b, c)) {
                    return a * b * c;
                }
            }
        }

        return -1;
    }

    private boolean test(int a, int b, int c) {
        return a * a + b * b == c * c;

    }

}
