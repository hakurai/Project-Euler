/**
 * @author eguchi
 */
public class Problem2 {
    public static void main(String[] args) {
        Timer.start();
        Problem2 problem = new Problem2();
        System.out.println(problem.execute(1, 2, 4000000));
        Timer.stop();
    }

    public int execute(int a, int b, int max) {
        int total = 0;
        while (b < max) {
            if (b % 2 == 0) {
                total += b;
            }
            int oldB = b;
            b = a + b;
            a = oldB;
        }

        return total;
    }

}
