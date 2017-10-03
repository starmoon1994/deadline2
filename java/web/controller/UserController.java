package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用户管理的controller层
 * Created by huxingyue on 2017/8/24.
 */
@Controller
public class UserController {

    @RequestMapping("/getToken")
    public String getToken(){

        return "demo";
    }

    @RequestMapping("/simpleLogin")
    public String simpleLogin(){

        return "demo";
    }
}
