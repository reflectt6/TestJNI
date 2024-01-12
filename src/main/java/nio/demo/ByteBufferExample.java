package nio.demo;

import java.nio.ByteBuffer;

public class ByteBufferExample {
    public static void main(String[] args) {
        // 创建一个 ByteBuffer
        ByteBuffer originalBuffer = ByteBuffer.allocate(10);

        // 向原始 ByteBuffer 中放入一些数据
        for (int i = 0; i < 5; i++) {
            originalBuffer.put((byte) i);
        }

        // 创建一个新的 ByteBuffer，是原始 ByteBuffer 的一个子序列
        ByteBuffer slicedBuffer = originalBuffer.slice();

        // 输出原始 ByteBuffer 的内容
        System.out.println("Original ByteBuffer:");
        while (originalBuffer.hasRemaining()) {
            System.out.print(originalBuffer.get() + " ");
        }

        // 输出新的 ByteBuffer 的内容
        System.out.println("\nSliced ByteBuffer:");
        while (slicedBuffer.hasRemaining()) {
            System.out.print(slicedBuffer.get() + " ");
        }
    }
}

