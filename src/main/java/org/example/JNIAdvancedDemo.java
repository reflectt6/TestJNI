package org.example;

import java.nio.charset.StandardCharsets;

// 探索复杂结构如何使用JNI
public class JNIAdvancedDemo {
    static {
        System.load("/Users/rainnight/codes/IdeaProjects/TestJni2/src/main/advanced-native/libJNIAdvancedDemo.so");
    }
    private static native void nativeAdd(NameReceiver nr, String name);

    public static void main(String[] args) {
        NameReceiver nr = new NameReceiver();
        nr.addName("XiaoLi");
        nr.addName("XiaoWang");
        nr.addName("AHo");
        nativeAdd(nr, "LiYou");
        System.out.println(nr.query(3));
    }
}

class NameReceiver {
    int count;
    int maxCnt;
    String[] names;
    byte[][] matrix;

    NameReceiver() {
        count = 0;
        maxCnt = 100;
        names = new String[100];
        matrix = new byte[100][];
    }

    void addName(String name) {
        if (count == maxCnt - 1) {
            throw new RuntimeException("exceed max count");
        }
        matrix[count] = name.getBytes(StandardCharsets.UTF_8);
        names[count] = name;
        count++;
    }

    String query(int index) {
        if (index <= 0) return names[0];
        else if (index >= count) return names[count];
        else return names[index];
    }
}
