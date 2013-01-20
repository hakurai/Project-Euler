/**
 * @author eguchi
 */
public class Problem3 {
    public static void main(String[] args) {
        Timer.start();
        Problem3 problem = new Problem3();
        System.out.println(problem.execute(600851475143L));
        Timer.stop();
    }

    public long execute(long n) {
        long current = 2;
        long d = n;

        while (d != current) {
            if (d % current == 0) {
                d = d / current;
            } else {
                current++;
            }
        }
        return current;
    }
}
