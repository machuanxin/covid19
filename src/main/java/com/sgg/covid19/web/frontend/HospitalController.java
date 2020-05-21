package com.sgg.covid19.web.frontend;

import com.sgg.covid19.entity.Hospital;
import com.sgg.covid19.service.HospitalService;
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
public class HospitalController {
    @Autowired
    private HospitalService hospitalService;

    @RequestMapping(value = "/listhospital", method = RequestMethod.GET)
    @ResponseBody
    private Map<String, Object> listFeverClinic() {
        Map<String, Object> modelMap = new HashMap<>();
        List<Hospital> list = null;
        try {
            list = hospitalService.getHospitalList();
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
