package com.sgg.covid19.web.frontend;

import com.sgg.covid19.entity.ProvinceTotal;
import com.sgg.covid19.service.ProvinceTotalService;
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
public class ProvinceTotalController {
    @Autowired
    private ProvinceTotalService provinceTotalService;

    @RequestMapping(value = "/listprovincetotal", method = RequestMethod.GET)
    @ResponseBody
    private Map<String, Object> listProvinceTotal() {
        Map<String, Object> modelMap = new HashMap<>();
        List<ProvinceTotal> provinceTotalList = null;
        try {
            provinceTotalList = provinceTotalService.getProvinceTotalList();
            modelMap.put("provinceTotalList", provinceTotalList);
            modelMap.put("success", true);
        } catch (Exception e) {
            e.printStackTrace();
            modelMap.put("success", false);
            modelMap.put("errMsg", e.toString());
        }
        return modelMap;
    }
}
