package org.example;

public class JNISimpleDemo {
    private native void print();
    public static void main(String[] args) {
        new JNISimpleDemo().print();
    }

    static {
        System.load("/Users/rainnight/codes/IdeaProjects/TestJni2/src/main/native/libSimpleDemo.so");
    }
}