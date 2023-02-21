package org.example.introduction;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Moto moto =context.getBean("moto", Moto.class);
        moto.go();
        context.close();
        System.out.println("------------------------------");

        ClassPathXmlApplicationContext context2 =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context2.getBean("person", Person.class);
        person.putTheDriver();
        context.close();
        System.out.println("------------------------------");

        ClassPathXmlApplicationContext context3 =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Transport car1 = context3.getBean("car", Car.class);
        Transport car2 = context3.getBean("car", Car.class);
        System.out.println(car1 == car2);
        System.out.println(car1);
        System.out.println(car2);
        context.close();
        System.out.println("------------------------------");

        ClassPathXmlApplicationContext context4 =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Transport moto1 = context4.getBean("moto", Moto.class);
        Transport moto2 = context4.getBean("moto", Moto.class);
        System.out.println(moto1==moto2);
        System.out.println(moto1);
        System.out.println(moto2);
        context.close();
        System.out.println("------------------------------");

       AnnotationConfigApplicationContext context5 =
                new AnnotationConfigApplicationContext(Config.class);
       Person person1 = context5.getBean("person", Person.class);
       person1.putTheDriver();
       context5.close();

    }
}
