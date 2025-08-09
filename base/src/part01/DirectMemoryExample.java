package part01;

import sun.nio.ch.DirectBuffer;

import java.nio.ByteBuffer;

/**
 * @author wangchen
 * @version 1.0
 */
public class DirectMemoryExample {

    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocateDirect(200 * 1024 * 1024); // 分配200MB的直接内存

        buffer.putInt(0, 123456); // 在直接内存中写入一个整数
        System.out.println(buffer.getInt(0)); // 从直接内存中读取该整数

        // 释放直接内存
        ((DirectBuffer) buffer).cleaner().clean();
    }
}
