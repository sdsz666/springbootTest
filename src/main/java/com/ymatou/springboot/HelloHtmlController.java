package com.ymatou.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloHtmlController {
	
	
	//get 参数直接在URL中
    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }
    
    
    //get 参数在？
    @RequestMapping("/caseedit")
    public String caseedit(@RequestParam("cid") String cid, Model model) {
        model.addAttribute("cid", cid);
        return "caseedit";
    }
    
    
    @RequestMapping("/index")
    public String indexPage() {return "index";}
    
}

