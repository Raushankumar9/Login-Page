package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controller {

    // Display the login form
    @RequestMapping(value = "/loginpage", method = RequestMethod.GET)
    public String loginpage()
    {
    return "Login";
    }

    // Handle login form submission
    @RequestMapping(value = "/Login", method = RequestMethod.POST)
    public String WelcomePage(LoginBean b)
    {
    return "Login";
    }
    public ModelAndView login(@ModelAttribute("StudentBean") StudentBean StudentBean) {
        ModelAndView mv = new ModelAndView();

        if ("Raushan".equals(StudentBean.getName()) && "12345".equals(StudentBean.getPass())) {
            mv.setViewName("welcome");
            mv.addObject("name", StudentBean.getName());
        } else {
            mv.setViewName("login");
            mv.addObject("error", "Invalid username or password.");
        }

        return mv;
    }
}
