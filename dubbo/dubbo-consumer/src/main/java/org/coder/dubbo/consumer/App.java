package org.coder.dubbo.consumer;

import junit.framework.Test;
import org.coder.dubbo.api.ExceptionTestService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

//        TestService testService = applicationContext.getBean(TestService.class);

        ExceptionTestService exceptionTestService1 = (ExceptionTestService) applicationContext.getBean("exceptionTestService1");
        String msg = exceptionTestService1.notException();
        System.out.println(msg);
        try {
            exceptionTestService1.throwException(2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            exceptionTestService1.throwException(1);
        } catch (Exception e) {
            e.printStackTrace();
        }


//        ExceptionTestService exceptionTestService2 = (ExceptionTestService) applicationContext.getBean("exceptionTestService2");

        System.out.println("Hello World!");
    }
}
