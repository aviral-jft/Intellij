package com.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    //public String display(HttpServletRequest req,Model m)
    public String display(@RequestParam("name")String name,@RequestParam("pass") String pass, Model m)
    {
        //String name =req.getParameter("name");
        //String pass=req.getParameter("pass");
        if(pass.equals("admin"))
        {
            String msg="Hello "+name;
            m.addAttribute("message",msg);
            return "viewpage";
        }
        else
        {
            String msg="Sorry "+name+" you have entered wrong password";
            m.addAttribute("message",msg);
            return "errorpage";
        }
    }
}