package cn.jd.nocar.utiles;

import cn.jd.nocar.domain.ServerList;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class DruidDatabasesUtils {
    DruidDataSource druidDataSource = new DruidDataSource();
    JdbcTemplate jdbcTemplate = new JdbcTemplate(druidDataSource);

    public void druidData(List<ServerList> serverLists,String excu){
        for (ServerList serverList : serverLists
             ) {
            druidDataSource.setDriverClassName("com.jdbc.mysql.Driver");
            //jdbc:mysql://ip:pord/
            druidDataSource.setUrl("jdbc:mysql://"+serverList.getIp()+":"+serverList.getPort()+"/"+serverList.getServers());
            druidDataSource.setUsername(serverList.getNc_username());
            druidDataSource.setPassword(serverList.getNc_password());
        }
        jdbcTemplate.execute(excu);
    }
}
