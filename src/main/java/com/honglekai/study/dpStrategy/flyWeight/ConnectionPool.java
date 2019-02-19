package com.honglekai.study.dpStrategy.flyWeight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

/**
 * description 享元模式
 * 1.实现对象的共享，即共享池，通常与工厂模式一起用
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/31 17:20
 * modifyTime
 */
public class ConnectionPool {

    private Vector<Connection> pool;

    private String url = "jdbc:mysql://10.66.203:3306/test";
    private String username = "newvss";

    private String password= "yh2016";

    private String driverClassName = "com.mysql.jdbc.Driver";

    private int poolSize = 100;

    private static ConnectionPool intance = null;


    private Connection con = null;

    private ConnectionPool() {
        pool = new Vector<>(poolSize);

        for (int i = 0; i < poolSize; i++) {
            try {
                Class.forName(driverClassName);
                con = DriverManager.getConnection(url,username,password);
                pool.add(con);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 返回连接到连接池
     */
    public synchronized  void release(){
        pool.add(con);
    }

    /**
     * 返回连接池中的一个数据库连接
     * @return
     */
    public synchronized Connection getConnetion(){
        if (pool.size()>0){
            Connection conn = pool.get(0);
            pool.remove(conn);
            return conn;
        }else {
            return null;
        }
    }


}
