package part01;

/**
 * @author wangchen
 * @version 1.0
 */
public class PCRegisterDemo {
    public static void main(String[] args) {
        int a = 1;          // 行号：3
        int b = 2;          // 行号：4
        int c = a + b;      // 行号：5
        System.out.println("a + b = " + c); // 行号：6
    }
}
