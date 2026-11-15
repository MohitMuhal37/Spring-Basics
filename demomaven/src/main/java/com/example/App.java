package com.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("maven.xml");
        // programmer obj = new programmer();
        programmer obj = (programmer) context.getBean("programmer");
        // obj.setAge(25);
        // System.out.println(obj.getAge());
        // obj.age = 87;
        // System.out.println(obj.age);
        obj.code();
        programmer obj1 = (programmer) context.getBean("programmer");
        // System.out.println(obj1.age);
        // obj1.code();
    }
}
