import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/**
 * @author eguchi
 */
public class Problem14 {

    private Map<Integer, Integer> countMemo = new HashMap<Integer, Integer>();

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Timer.start();
        Problem14 problem = new Problem14();
        System.out.println(problem.execute(1000000));
        Timer.stop();
    }

    public int execute(int len) {
        int res = 0;
        int max = 0;
        for (int i = 1; i < len; i++) {
            int num = collatz(i);
            if (num > max) {
                max = num;
                res = i;
            }
        }

        return res;
    }

    private int collatz(long num) {
        if (num == 1) {
            return 1;
        }

        int count = 0;
        while (num != 1) {
            Integer memo = countMemo.get(num);
            if (memo != null) {
                return memo + count;
            }
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = 3 * num + 1;
            }
            count++;
        }

        return count + 1;
    }
}
