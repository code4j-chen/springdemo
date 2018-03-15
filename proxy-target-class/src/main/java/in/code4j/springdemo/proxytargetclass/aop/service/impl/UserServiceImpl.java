package in.code4j.springdemo.proxytargetclass.aop.service.impl;

import in.code4j.springdemo.proxytargetclass.aop.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    public void addUser() {
        System.out.println("add user.");
    }
}
