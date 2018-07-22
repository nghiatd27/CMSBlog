package com.dn.cmsblog.web.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
    @RequestMapping("/user")
    public String user() {
        return "index";
    }
}
