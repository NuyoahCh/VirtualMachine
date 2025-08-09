package part01;

/**
 * @author wangchen
 * @version 1.0
 */
public class StackDemo {
    static void recursive(int i) {
        System.out.println("深度：" + i);
        recursive(i + 1);
    }

    public static void main(String[] args) {
        recursive(1);
    }
}
