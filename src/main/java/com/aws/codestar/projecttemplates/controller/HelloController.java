package com.aws.codestar.projecttemplates.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

/**
 * Basic Spring MVC controller that handles all GET requests.
 */
@Controller
@RequestMapping("/hello")
public class HelloController {
    private String name="Venkatesh";
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView helloWorld() {
        ModelAndView mav = new ModelAndView("hello");
	mav.addObject("name", name);
        return mav;
    }

    @RequestMapping(method = RequestMethod.GET, value="/{name}")
    public ModelAndView hellonewWorld(@PathVariable("name") String argname) {
        ModelAndView mav = new ModelAndView("hello");
	mav.addObject("name", argname);
        return mav;
    }

}
