/**
 * @author eguchi
 */
public class Problem7 {
    public static void main(String[] args) {
        Timer.start();
        Problem7 problem = new Problem7();
        System.out.println(problem.execute(10001));
        Timer.stop();
    }

    public int execute(int num) {
        int i = 1;
        int count = 0;
        while (count != num){
            i++;
            if(test(i)){
                count++;
            }

        }

        return i;
    }

    private boolean test(int n) {
        int max = n / 2;
        for (int i = 2; i <= max; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

}
