package cn.jd.nocar.service.impl;

import cn.jd.nocar.dao.ServerListDao;
import cn.jd.nocar.domain.ServerList;
import cn.jd.nocar.service.ServerListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class ServerListServiceImpl implements ServerListService {
    @Autowired
    private ServerListDao serverListDao;

    @Override
    public List<ServerList> findAll() {
        return serverListDao.findAll();
    }

    @Override
    public void insertServerList(ServerList list) {
        serverListDao.insertServerList(list);
    }
}
