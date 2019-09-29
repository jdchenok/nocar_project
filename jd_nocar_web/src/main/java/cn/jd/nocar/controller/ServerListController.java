package cn.jd.nocar.controller;

import cn.jd.nocar.domain.ServerList;
import cn.jd.nocar.service.ServerListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/serverList")
public class ServerListController {

    @Autowired
    private ServerListService serverListService;
    @RequestMapping("/findAll.do")
    public ModelAndView findAll(){
        ModelAndView mv = new ModelAndView();
        List<ServerList> serverLists = serverListService.findAll();
        mv.addObject("ordersList",serverLists);
        mv.setViewName("orders-list");
        return mv;
    }
}
