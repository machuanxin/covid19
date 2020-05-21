package com.sgg.covid19.web.frontend;

import com.sgg.covid19.entity.ProvinceWork;
import com.sgg.covid19.service.ProvinceWorkService;
import com.sgg.covid19.util.HttpServletRequestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/frontend")
public class ProvinceWorkController {
    @Autowired
    private ProvinceWorkService provinceWorkService;

    @RequestMapping(value = "/listprovincework", method = RequestMethod.GET)
    @ResponseBody
    private Map<String, Object> listProvinceWork(HttpServletRequest request) {
        Map<String, Object> modelMap = new HashMap<>();
        List<ProvinceWork> list = null;
        String date = HttpServletRequestUtil.getString(request, "date");
        try {
            list = provinceWorkService.getProvinceWorkList(date);
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
