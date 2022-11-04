package org.example;

@FunctionalInterface
public interface I {

    void m1();

    default void m2(){
        System.out.println("1 default method of I");
    }

    default void m3(){
        System.out.println("2 default method of I");
    }

    static void m4(){
        System.out.println("1 static method of I");
    }

    static void m5(){
        System.out.println("2 static method of I");
    }
}
