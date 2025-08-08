package part02;

/**
 * @author wangchen
 * @version 1.0
 */
public class ReachabilityAnalysis {

    // GC Roots 示例
    Object root1 = new Object();
    static Object root2 = new Object();


    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        obj1 = null; // obj1 不再可达，断开引用，成为垃圾
        System.gc();
    }
}
