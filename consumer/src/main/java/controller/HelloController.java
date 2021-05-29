package controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.HelloService;

@Controller
public class HelloController {

    @DubboReference
    private HelloService helloService;

    @RequestMapping("/hello")
    @ResponseBody
    public String Hello(){
        System.out.println("consumer startup......");
        helloService.hello();
        return "success!";
    }
}
