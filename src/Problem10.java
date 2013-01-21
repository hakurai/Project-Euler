import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author eguchi
 */
public class Problem10 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Timer.start();
        Problem10 problem = new Problem10();
        System.out.println(problem.execute(2000000));
        Timer.stop();
    }

    public long execute(int num) throws ExecutionException, InterruptedException {
        long total = 0;
        int numThreads = 16;
        int d = num / numThreads;
        ExecutorService service = Executors.newFixedThreadPool(numThreads);

        Worker worker;
        List<Future<Long>> futures = new ArrayList<Future<Long>>(numThreads);
        for (int i = 0; i < numThreads; i++) {
            worker = new Worker(d * i, d * (i + 1));
            futures.add(service.submit(worker));
        }
        if (num % numThreads != 0) {
            worker = new Worker(d * numThreads, num);
            futures.add(service.submit(worker));
        }

        for (Future<Long> f : futures) {
            total += f.get();
        }

        return total - 1;
    }


    public static class Worker implements Callable<Long> {
        private int start;
        private int end;

        public Worker(int start, int end) {
            System.out.println(start + ":" + end);
            this.start = start;
            this.end = end;
        }

        @Override
        public Long call() throws Exception {
            long total = 0;
            int e = end;
            for (int i = start; i < e; i++) {
                if (test(i)) {
                    total += i;
                }
            }
            return total;
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

}
