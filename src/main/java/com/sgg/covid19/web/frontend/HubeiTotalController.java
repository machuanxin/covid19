package com.sgg.covid19.web.frontend;

import com.sgg.covid19.entity.HubeiTotal;
import com.sgg.covid19.entity.ProvinceTotal;
import com.sgg.covid19.service.HubeiTotalService;
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
public class HubeiTotalController {
    @Autowired
    private HubeiTotalService hubeiTotalService;

    @RequestMapping(value = "/listhubeitotal", method = RequestMethod.GET)
    @ResponseBody
    private Map<String, Object> listHubeiTotal() {
        Map<String, Object> modelMap = new HashMap<>();
        List<HubeiTotal> hubeiTotalList = null;
        try {
            hubeiTotalList = hubeiTotalService.getHubeiTotalList();
            modelMap.put("hubeiTotalList", hubeiTotalList);
            modelMap.put("success", true);
        } catch (Exception e) {
            e.printStackTrace();
            modelMap.put("success", false);
            modelMap.put("errMsg", e.toString());
        }
        return modelMap;
    }
}
