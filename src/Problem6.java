/**
 * @author eguchi
 */
public class Problem6 {
    public static void main(String[] args) {
        Timer.start();
        Problem6 problem = new Problem6();
        System.out.println(problem.execute(100));
        Timer.stop();
    }

    public int execute(int max) {
        int sum = 0;
        for (int i = 1; i <= max; i++) {
            sum += square(i);
        }

        int square = square((1 + max) * max / 2);

        return square - sum;
    }

    private int square(int n) {
        return n * n;
    }

}
