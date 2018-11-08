package com.sundy.ac;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AcServer {
    public static void main(String[] args) {
        try {
            System.setProperty("java.net.preferIPv4Stack", "true");
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"/spring/applicationContext.xml"});
            context.start();
            System.in.read(); // press any key to exit
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
