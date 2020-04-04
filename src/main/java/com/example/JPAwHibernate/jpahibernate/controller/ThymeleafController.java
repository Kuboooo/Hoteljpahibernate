package com.example.JPAwHibernate.jpahibernate.controller;

import com.example.JPAwHibernate.jpahibernate.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {

    @Autowired
    DashboardService dashboardService;


    @RequestMapping("/")
    public String getDashDetail(Model model){


        model.addAttribute("cr", dashboardService.getTodayRevenueDash());

        return "/index";
    }

}
