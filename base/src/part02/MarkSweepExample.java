package part02;

/**
 * @author wangchen
 * @version 1.0
 */
public class MarkSweepExample {

    public static void main(String[] args) {
        Object objA = new Object();
        Object objB = new Object();
        objA = objB;

        System.gc();
    }
}
