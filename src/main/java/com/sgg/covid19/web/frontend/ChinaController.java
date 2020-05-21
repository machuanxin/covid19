package com.sgg.covid19.web.frontend;

import com.sgg.covid19.entity.China;
import com.sgg.covid19.service.ChinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/frontend")
public class ChinaController {
    @Autowired
    private ChinaService chinaService;

    @RequestMapping(value = "/listchina", method = RequestMethod.GET)
    @ResponseBody
    private Map<String, Object> listChina() {
        Map<String, Object> modelMap = new HashMap<>();
        List<China> list = null;
        try {
            list = chinaService.getChinaList();
            modelMap.put("list", list);
            modelMap.put("total", list.size());
            modelMap.put("success", true);
        } catch (Exception e) {
            e.printStackTrace();
            modelMap.put("success", false);
            modelMap.put("errMsg", e.toString());
        }
        return modelMap;
    }
}
