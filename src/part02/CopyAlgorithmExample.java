package part02;

/**
 * @author wangchen
 * @version 1.0
 */
public class CopyAlgorithmExample {

    public static void main(String[] args) {
        byte[] obj1 = new byte[2 * 1024 * 1024]; // 分配 2MB 的内存
        byte[] obj2 = new byte[2 * 1024 * 1024]; // 分配 2MB 的内存
        byte[] obj3 = new byte[2 * 1024 * 1024]; // 分配 2MB 的内存

        obj1 = null; // 断开 obj1 的引用
        System.gc(); // 请求垃圾回收
    }
}
