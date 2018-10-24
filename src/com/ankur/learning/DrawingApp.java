package com.ankur.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ankurpratik on 23/10/18.
 */
public class DrawingApp {

    public static void main(String[] args) {
        //com.ankur.learning.Triangle triangle = new com.ankur.learning.Triangle();
        //BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring-config.xml"));
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangle = (Triangle) context.getBean("triangle");
        triangle.onDraw();

        Rectangle rectangle = (Rectangle) context.getBean("rectangle");
        rectangle.onDraw();
    }
}
