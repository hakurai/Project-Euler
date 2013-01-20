/**
 * @author eguchi
 */
public class Problem2 {
    public static void main(String[] args) {
        Problem2 problem2 = new Problem2();

        System.out.println(problem2.execute(1, 2, 4000000));
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
