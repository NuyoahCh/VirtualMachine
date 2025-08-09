package part02;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * @author wangchen
 * @version 1.0
 */
public class ReferenceTypes {
    public static void main(String[] args) {
        // 强引用示例
        Object strongRef = new Object();

        // 软引用示例
        SoftReference<Object> softReference = new SoftReference<>(new Object());
        System.gc();
        System.out.println(softReference.get()); // 软引用可能被回收，取决于内存情况，内存不足前可提前获取

        // 弱引用示例
        WeakReference<Object> weakReference = new WeakReference<>(new Object());
        System.gc();
        System.out.println(weakReference.get()); // 弱引用在 GC 时会被回收，通常为 null

        // 虚引用示例
        // 虚引用没有实际的引用对象，主要用于跟踪对象的生命周期
        ReferenceQueue<Object> queue = new ReferenceQueue<>();
        PhantomReference<Object> phantomReference = new PhantomReference<>(new Object(), queue);
        System.gc();
        System.out.println(queue.poll());


    }
}
