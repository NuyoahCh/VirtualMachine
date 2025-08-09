package part02;

/**
 * @author wangchen
 * @version 1.0
 */
public class MarkCompactExample {

    public static void main(String[] args) {

        byte[] oldObj1 = new byte[8 * 1024 * 1024]; // 分配 2MB 的内存
        byte[] oldObj2 = new byte[8 * 1024 * 1024]; // 分配 2MB 的内存

        oldObj1 = null; // 断开 oldObj1 的引用
        System.gc();
    }
}
