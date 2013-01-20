/**
 * @author eguchi
 */
public class Problem4 {
    public static void main(String[] args) {
        Timer.start();
        Problem4 problem = new Problem4();
        System.out.println(problem.execute());
        Timer.stop();
    }

    public int execute() {
        for (int i = 999; i > 99; i--) {
            int number = number(i);
            if (test(number)) {
                return number;
            }
        }

        return -1;
    }

    private int number(int a) {
        return Integer.parseInt(a + new StringBuilder(Integer.toString(a)).reverse().toString());
    }

    private boolean test(int n) {
        int current = 999;
        int ans = 999;
        while (ans > 99 && current > 99 && current >= ans) {
            ans = n / current;
            if (n % current == 0 && current < 1000 && ans < 1000) {
                return true;
            }
            current--;
        }
        return false;

    }
}
