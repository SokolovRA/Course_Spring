package org.example.introduction;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Moto implements Transport {
    @Override
    public void go() {
        System.out.println("Мотоцикл едет");
    }
    public void init() {
        System.out.println("Class Car: init");
    }

    public void destroy() {
        System.out.println("Class Car: destroy");
    }
}

