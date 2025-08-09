package part03;

/**
 * @author wangchen
 * @version 1.0
 */
public class C {

    private int a = 1234;
    static long C = 1111;

    public long test(long num) {
        long ret = this.a + num + C;
        return ret;
    }
}
