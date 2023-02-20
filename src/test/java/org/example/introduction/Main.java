package org.example.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = context.getBean("customCar", Car.class);
        car.go();
        context.close();

        System.out.println("------------------------------");

        ClassPathXmlApplicationContext context2 =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Person person = context2.getBean("customPerson", Person.class);
        person.putTheDriver();
        context.close();
        System.out.println("------------------------------");

        ClassPathXmlApplicationContext context3 =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Car car1 = context3.getBean("customCar", Car.class);
        Car car2 = context3.getBean("customCar", Car.class);
        System.out.println(car1 == car2);
        System.out.println(car1);
        System.out.println(car2);
        context.close();

        System.out.println("------------------------------");

        ClassPathXmlApplicationContext context4 =
                new ClassPathXmlApplicationContext("applicationContext4.xml");

        Car car3 = context4.getBean("customCar", Car.class);
        Car car4 = context4.getBean("customCar", Car.class);
        System.out.println(car3==car4);
        System.out.println(car3);
        System.out.println(car4);
        context.close();
    }
}
