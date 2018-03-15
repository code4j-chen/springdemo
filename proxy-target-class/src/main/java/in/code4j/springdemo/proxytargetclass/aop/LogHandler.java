package in.code4j.springdemo.proxytargetclass.aop;

import org.springframework.stereotype.Component;

@Component
public class LogHandler {
    public void logBefore() {
        System.out.println("log before method.");
    }

    public void logAfter() {
        System.out.println("log after method.");
    }
}
