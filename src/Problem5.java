import java.util.HashMap;
import java.util.Map;

/**
 * @author eguchi
 */
public class Problem5 {
    public static void main(String[] args) {
        Timer.start();
        Problem5 problem = new Problem5();
        System.out.println(problem.execute(20));
        Timer.stop();
    }

    public int execute(int max) {
        Map<Integer, Integer> setMap = new HashMap<Integer, Integer>();
        for (int i = 1; i <= max; i++){
            Map<Integer, Integer> map = Util.primeNumbers(i);
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                Integer oldNum = setMap.get(entry.getKey());
                if( oldNum == null || entry.getValue() > oldNum){
                    setMap.put(entry.getKey(),entry.getValue());
                }
            }
        }

        int res = 1;
        for (Map.Entry<Integer, Integer> entry : setMap.entrySet()) {
            int times = entry.getValue();
            int key = entry.getKey();
            for( int i = 0; i < times; i++){
                res *= key;
            }
        }

        return res;
    }


}
