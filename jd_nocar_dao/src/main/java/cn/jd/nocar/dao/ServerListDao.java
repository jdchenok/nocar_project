package cn.jd.nocar.dao;

import cn.jd.nocar.domain.ServerList;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 数据库包的增删改查
 */
public interface ServerListDao {
    /**
     * 查询所有
     * @return
     */
    @Select("select * from nocar_table")
    List<ServerList> findAll();

    /**
     * 根据ip查询
     * @param ip
     * @return
     */
    @Select("SELECT * FROM nocar_table where ip=#{ip}")
    List<ServerList> findIp(String ip);


    /**
     * 增加数据库数据
     */
    @Insert("insert into nocar_table(ip,port,servers,nc_username,nc_password,createtime,state)values(#{ip},#{port},#{servers},#{nc_username},#{nc_password},#{createtime},#{state});")
    void insertServerList(ServerList list);
}
