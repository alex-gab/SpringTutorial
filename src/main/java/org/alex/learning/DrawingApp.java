package org.alex.learning;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public final class DrawingApp {
    public static void main(String[] args) {
        final BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml");
        final Triangle triangle = (Triangle) beanFactory.getBean("triangle-alias");
        triangle.draw();
    }
}
