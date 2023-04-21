package _03.ch07.client.web;

import _03.ch07.domain.userinfo.UserInfo;
import _03.ch07.domain.userinfo.dao.UserInfoDao;
import _03.ch07.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import _03.ch07.domain.userinfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("db.properties");

        Properties prop = new Properties();
        prop.load(fis);   // name : value으로 추출!

        String dbType = prop.getProperty("DBTYPE");
        String dbVer = prop.getProperty("DBVER");
        System.out.println(dbType);
        System.out.println(dbVer);


        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("um2020");
        userInfo.setPasswd("122");
        userInfo.setUserName("엄");

        UserInfoDao dao = null;

        if(dbType.equals("ORACLE")){
            dao = new UserInfoOracleDao();
        }else if(dbType.equals("MYSQL")){
            dao = new UserInfoMySqlDao();

        }else {
            System.out.println("지원 하지 않아!");
        }


        if(dao!=null){
            dao.insertUserInfo(userInfo);
            dao.updateUserInfo(userInfo);
            dao.deleteUserInfo(userInfo);
        }



    }
}
