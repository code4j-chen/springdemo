package in.code4j.springdemo.proxytargetclass.aop.service.impl;

import in.code4j.springdemo.proxytargetclass.aop.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-aop.xml")
public class UserServiceImplTest {

    @Resource
    private UserService userService;

    @Test
    public void addUser() {
        userService.addUser();
    }
}