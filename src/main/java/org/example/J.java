package org.example;


public interface J extends I{


    default void k2(){
        System.out.println("1 default method of I");
    }

    default void k3(){
        System.out.println("2 default method of I");
    }

    static void k4(){
        System.out.println("1 static method of I");
    }

    static void k5(){
        System.out.println("2 static method of I");
    }

    @Override
    default void m2() {
        System.out.println("1 default method of I has been updated");
    }
}
