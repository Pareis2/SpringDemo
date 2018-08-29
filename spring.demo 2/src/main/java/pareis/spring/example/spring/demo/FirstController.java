package pareis.spring.example.spring.demo;

import apple.laf.JRSUIConstants;

import java.awt.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping ("/hello")
@RestController
public class FirstController {
    @RequestMapping(method = RequestMethod.GET)
    public String index() {
            return "Hello";
    }
}








