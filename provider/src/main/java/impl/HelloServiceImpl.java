package impl;

import org.apache.dubbo.config.annotation.DubboService;
import service.HelloService;

@DubboService
public class HelloServiceImpl implements HelloService {
    @Override
    public void hello() {
        System.out.println("provider startup......");
    }
}
