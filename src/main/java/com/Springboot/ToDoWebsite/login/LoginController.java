package com.Springboot.ToDoWebsite.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @RequestMapping("login")
    public String goToLoginPage(@RequestParam String name, ModelMap model){
        model.put("name", name);
        return "login";
    }
}
