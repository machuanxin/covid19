package com.sgg.covid19.web.frontend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/frontend")
public class FrontendController {
    /**
     * 首页路由
     * @return
     */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    private String index() {
        return "index";
    }

}
