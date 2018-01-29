package se.nextit.soap;

import javax.jws.WebService;

@WebService
public class HelloServiceImpl {
    public String sayHello() {
        return "Hello";
    }
}
