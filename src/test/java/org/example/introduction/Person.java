package org.example.introduction;

public class Person {
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }
//    public Person(Car car) {
//        this.car = car;
//    }

    void putTheDriver(){
        System.out.println("Владелец сел в автомобиль");
        car.go();
    }
}
