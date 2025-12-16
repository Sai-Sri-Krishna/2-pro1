package com.my_project.my.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class submit {

    @PostMapping("/submit")
    @ResponseBody
    public String handleForm(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String password) {

        return "Received: " + name + ", " + email + ", " + password;
    }
}