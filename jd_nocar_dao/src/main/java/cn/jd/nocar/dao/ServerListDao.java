package cn.jd.nocar.dao;

import cn.jd.nocar.domain.ServerList;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 数据库包的增删改查
 */
public interface ServerListDao {
    @Select("select * from nocar_table")
    List<ServerList> findAll();

    @Select("SELECT * FROM nocar_table where ip=#{ip}")
    List<ServerList> findIp(String ip);
}
