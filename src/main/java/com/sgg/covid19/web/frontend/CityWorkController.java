package com.sgg.covid19.web.frontend;

import com.sgg.covid19.entity.CityWork;
import com.sgg.covid19.service.CityWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/frontend")
public class CityWorkController {
    @Autowired
    private CityWorkService cityWorkService;

    @RequestMapping(value = "/listcitywork", method = RequestMethod.GET)
    @ResponseBody
    private Map<String, Object> listCityWork() {
        Map<String, Object> modelMap = new HashMap<>();
        List<CityWork> list = null;
        try {
            list = cityWorkService.getCityWorkList();
            modelMap.put("list", list);
            modelMap.put("success", true);
        } catch (Exception e) {
            e.printStackTrace();
            modelMap.put("success", false);
            modelMap.put("errMsg", e.toString());
        }
        return modelMap;
    }
}
