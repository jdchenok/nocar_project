package cn.jd.nocar.service.impl;

import cn.jd.nocar.utiles.DruidDatabasesUtils;

public class DbaHandleServiceImpl {
    DruidDatabasesUtils databasesUtils = new DruidDatabasesUtils();

    public void setDatabasesUtils(DruidDatabasesUtils databasesUtils) {
        this.databasesUtils = databasesUtils;
    }
}
