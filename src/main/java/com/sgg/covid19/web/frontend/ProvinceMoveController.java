package com.sgg.covid19.web.frontend;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sgg.covid19.entity.ProvinceMove;
import com.sgg.covid19.service.ProvinceMoveService;
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
public class ProvinceMoveController {
    @Autowired
    private ProvinceMoveService provinceMoveService;

    @RequestMapping(value = "/listprovincemove", method = RequestMethod.GET)
    @ResponseBody
    private Map<String, Object> listProvinceMove(HttpServletRequest request) {
        Map<String, Object> modelMap = new HashMap<>();
        List<ProvinceMove> list = null;
        String mDate= HttpServletRequestUtil.getString(request, "mDate");
        try {
            list = provinceMoveService.getProvinceMoveList(mDate);
            modelMap.put("list", list);
            modelMap.put("success", true);
        } catch (Exception e) {
            e.printStackTrace();
            modelMap.put("success", false);
            modelMap.put("errMsg", e.toString());
        }
        return modelMap;
    }

    /**
     * 获得分页对象，里面封装了分页需要的所有信息
     * @param request
     * @param pageNum  当前是第几页
     * @param pageSize  当前页一共显示多少条数据
     * @return
     */
    @RequestMapping(value = "/provincemovepageinfo", method = RequestMethod.GET)
    @ResponseBody
    public PageInfo<ProvinceMove> getProvinceMoveListPageInfo(HttpServletRequest request, int pageNum, int pageSize){
        String mDate= HttpServletRequestUtil.getString(request, "mDate");
        //1/通过调用PageHelper的静态方法开始获取分页数据
        //指定当前是第几页，以及每页显示的记录条数
        PageHelper.startPage(pageNum, pageSize);
        //2.获得所有数据记录
        List<ProvinceMove> list = provinceMoveService.getProvinceMoveList(mDate);
        //3.获取当前分页对象
        PageInfo<ProvinceMove> pageInfo = new PageInfo<ProvinceMove>(list);
        return pageInfo;
    }
}
