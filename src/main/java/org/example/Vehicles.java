package org.example;

// In function Interface we can create only single abstract method (SAM) but multiple default and static methods
// In default method, methods can be override/change according to our need
// In static method, method cannot be override/change

@FunctionalInterface
public interface Vehicles {
    void horn();

    default void speedMeter(){
        System.out.println("common default function...");
    }

    static void engine(){
        System.out.println("common static function");
    }
}
