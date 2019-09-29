package cn.jd.nocar.utiles;

import com.alibaba.druid.pool.DruidDataSource;

public class DruidDatabasesUtils {
    DruidDataSource druidDataSource = null;

    public void setDruidDataSource(DruidDataSource druidDataSource) {
        this.druidDataSource = druidDataSource;
    }

    public DruidDataSource getDruidDataSource() {
        return druidDataSource;
    }
}
