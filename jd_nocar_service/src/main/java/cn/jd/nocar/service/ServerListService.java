package cn.jd.nocar.service;

import cn.jd.nocar.domain.ServerList;

import java.util.List;

public interface ServerListService {
    /**
     * 查询全部数据
     * @return
     */
    List<ServerList> findAll();

    /**
     * 增加数据
     * @param list
     */
    void insertServerList(ServerList list);
}
