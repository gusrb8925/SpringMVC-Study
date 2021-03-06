package com.example.restfulwebservice.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController // 자동으로 json 반환 @Controller + @ResponseBody
public class HelloWorldController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping(path = "/hello-world")
    public String helloWorld() {

        return "hello World";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean() {

        return new HelloWorldBean("hello World");
    }

    @GetMapping(path = "/hello-world-bean/path-variable/{name}")
    public HelloWorldBean helloWorldBean(@PathVariable String name) {

        return new HelloWorldBean("hello World, " + name);
    }

    @GetMapping(path = "/hello-world-internationalized")
    public String helloWorldInternationalized(
            @RequestHeader(name = "Accept-Language", required = false) Locale locale) {

        return messageSource.getMessage("greeting.message", null, locale);
    }

}
