package cn.jd.nocar.controller;

import cn.jd.nocar.domain.ServerList;
import cn.jd.nocar.service.ServerListService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/serverList")
public class ServerListController {

    @Autowired
    private ServerListService serverListService;

    @RequestMapping("/findAll.do")
    @ResponseBody
    public List<ServerList> findAll(){
        List<ServerList> serverLists = serverListService.findAll();
        return serverLists;
    }

    @RequestMapping("/insert.do")
    public void insertServerList (ServerList list){
        serverListService.insertServerList(list);
    }
}
