package com.zpdu.test04;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.jupiter.api.Test;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
@SuppressWarnings("all")
public class Test04 {
    @Test
    public void test() {
        try {
//            普通方式加载
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            String url = "jbdc:mysql://127.0.0.1:3360/test?useSSL=false";
//            String username  = "root";
//            String password = "123456";
//            Connection connection = DriverManager.getConnection(url, username, password);
            Properties properties = new Properties();                                                        //加载配置文件
            properties.load(Test04.class.getResourceAsStream("druid.properties"));
            DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);                        //获取连接池对象
            Connection connection = dataSource.getConnection();
//            Statement statement = connection.createStatement();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from test01");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) + "\t" +
                        resultSet.getString(2) + "\t" +
                        resultSet.getString(3) + "\t" +
                        resultSet.getString(4) + "\t" +
                        resultSet.getString(5) + "\t" +
                        resultSet.getString(6));
            }
            connection.close();
            resultSet.close();
            preparedStatement.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
