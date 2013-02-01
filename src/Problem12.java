import java.util.concurrent.ExecutionException;

/**
 * @author eguchi
 */
public class Problem12 {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Timer.start();
        Problem12 problem = new Problem12();
        System.out.println(problem.execute());
        Timer.stop();
    }

    public long execute() {
        int num = 0;
        int sum = 0;

        for (int i = 1; num < 500; i++) {
            sum += i;
            num = Util.countDivisor(sum);
        }
        return sum;
    }
}
