package in.code4j.springdemo.proxytargetclass.aop.service.impl;

import in.code4j.springdemo.proxytargetclass.aop.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImplTest1 {

    @Test
    public void testProxyTargetClass() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-aop.xml");
//        UserService userService = (UserService) context.getBean("userServiceImpl");

        //proxy-target-class="true"，为false时会报转换错误
        UserServiceImpl userService = (UserServiceImpl)context.getBean("userServiceImpl");
        userService.addUser();
    }

}