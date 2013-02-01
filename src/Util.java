import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * @author eguchi
 */
public final class Util {
    private Util() {
    }

    /**
     * 引数の値を素因数分解します。
     *
     * @param n
     * @return
     */
    public static Map<Integer, Integer> primeNumbers(int n) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        int d = 2;
        while (n != 1) {
            if (n % d == 0) {
                Integer num = map.get(d);
                if (num != null) {
                    map.put(d, num + 1);
                } else {
                    map.put(d, 1);
                }

                n /= d;
            } else {
                d++;
            }

        }

        return map;
    }

    /**
     * 引数の値の約数の数を返します
     *
     * @return
     */
    public static int countDivisor(int n) {
        int num = 1;

        Map<Integer, Integer> map = primeNumbers(n);
        for (Integer i : map.values()) {
            num *= (i + 1);
        }

        return num;
    }

    public static BigInteger factorial(int n) {
        BigInteger res = new BigInteger("1");
        for (int i = 2; i <= n; i++) {
            res = res.multiply(new BigInteger(Integer.toString(i)));
        }
        return res;
    }
}
