import java.util.concurrent.ExecutionException;

/**
 * @author eguchi
 */
public class Problem15 {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Timer.start();
        Problem15 problem = new Problem15();
        System.out.println(problem.execute());
        Timer.stop();
    }

    public String execute() {
        return Util.factorial(40).divide(Util.factorial(20)).divide(Util.factorial(20)).toString();
    }

}
