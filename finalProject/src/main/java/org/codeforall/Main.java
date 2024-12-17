package org.codeforall;

import org.codeforall.controllers.Controller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

    ApplicationContext context = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/spring/spring-config.xml");
    Controller controller = context.getBean("controller", Controller.class);

    controller.testFamily();
    controller.start();
    }
}
