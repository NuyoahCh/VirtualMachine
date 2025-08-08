package part03;

/**
 * @author wangchen
 * @version 1.0
 */
public class D {

    private C c = new C();

    public static void main(String[] args) {
        D d = new D();
        long num = 4321;
        long ret = d.c.test(num);
        System.out.println(ret);
    }
}
