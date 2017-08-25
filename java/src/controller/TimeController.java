package src.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import src.model.User;

import java.util.Date;
import java.util.UUID;

@RestController     //这是一个restful接口
@RequestMapping("/time")
public class TimeController {

    @RequestMapping("/test")
    public User test() {    //测试
        User user = new User();
        user.setUuid(UUID.randomUUID().toString());
        user.setToken(UUID.randomUUID().toString());
        user.setCreate_time(new Date(System.currentTimeMillis()).toString());
        return user;
    }
}
