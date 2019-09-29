package cn.jd.test;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class DruidDataSourceTest {
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    DruidDataSource druidDataSource = new DruidDataSource();

    public void setDruidDataSource(DruidDataSource druidDataSource) throws SQLException {
        this.druidDataSource = druidDataSource;
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://39.100.159.26:3306/nocar");
        Connection connection = druidDataSource.getConnection("root","mysql");
    }

    public DruidDataSource getDruidDataSource() throws SQLException {
        conn = druidDataSource.getConnection();
        String sql = "select * from nocar_table";
        pstmt = conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
        return druidDataSource;
    }

    //    Statement statement = setDruidDataSource();



    }

