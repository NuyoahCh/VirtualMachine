package part01;

/**
 * @author wangchen
 * @version 1.0
 */
public class NativeDemo {

    public native void nativeMethod(); // 本地方法声明

    static {
        System.loadLibrary("NativeDemo"); // 加载本地库
    }
}
