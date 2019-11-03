package com.cwq.springbootcommunity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author cwq
 * @date 2019/11/3 - 15:46
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }


}