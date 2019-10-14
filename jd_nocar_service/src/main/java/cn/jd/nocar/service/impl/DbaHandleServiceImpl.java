package cn.jd.nocar.service.impl;

import cn.jd.nocar.domain.ServerList;
import cn.jd.nocar.utiles.DruidDatabasesUtils;

import java.util.List;

public class DbaHandleServiceImpl {
    public void test(List<ServerList> serverLists,String excu){
        DruidDatabasesUtils druidDatabasesUtils = new DruidDatabasesUtils();
        druidDatabasesUtils.druidData(serverLists,excu);
    }
}
