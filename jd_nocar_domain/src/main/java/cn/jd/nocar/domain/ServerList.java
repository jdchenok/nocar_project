package cn.jd.nocar.domain;

/**
 * 数据库实体类
 */
public class ServerList {
    //主键
    private Integer id;
    //IP地址
    private String ip;
    //端口
    private String port;
    //数据库名
    private String servers;
    //用户名
    private String nc_username;
    //密码
    private String nc_password;
    //创建时间
    private String createtime;
    //更新时间
    private Integer state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getServers() {
        return servers;
    }

    public void setServers(String servers) {
        this.servers = servers;
    }

    public String getNc_username() {
        return nc_username;
    }

    public void setNc_username(String nc_username) {
        this.nc_username = nc_username;
    }

    public String getNc_password() {
        return nc_password;
    }

    public void setNc_password(String nc_password) {
        this.nc_password = nc_password;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "ServerList{" +
                "id=" + id +
                ", ip='" + ip + '\'' +
                ", port='" + port + '\'' +
                ", servers='" + servers + '\'' +
                ", nc_username='" + nc_username + '\'' +
                ", nc_password='" + nc_password + '\'' +
                ", createtime='" + createtime + '\'' +
                ", state=" + state +
                '}';
    }
}

