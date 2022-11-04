package org.example;

public class Main {
    public static void main(String[] args) {
        Vehicles vehicles = new Car();
        vehicles.horn();
        Vehicles.engine();

        Vehicles vehicles1 = new Bike();
        vehicles1.horn();
        vehicles1.speedMeter();

//        J obj = new J() {
//            @Override
//            public void m1() {
//                System.out.println("m1 anonymous function...");
//            }
//        };
//        obj.m1();

//        J obj = new J() {
//            @Override
//            public void m1() {
//                System.out.println("m1 is running...");
//            }
//        };
//
//        obj.m1();
//
//        obj.m2();

        J obj = new J() {
            @Override
            public void m1() {
                System.out.println("");
            }
        };

        Sum obj1 = (a, b) -> a+b;
        System.out.println("Sum is: " + obj1.add(20, 40));

        FuncInter obj2 = () -> {
            return "I have to go";
        };

        System.out.println(obj2.Sayable());


    }
}