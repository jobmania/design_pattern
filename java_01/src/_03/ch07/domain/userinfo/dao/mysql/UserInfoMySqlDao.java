package _03.ch07.domain.userinfo.dao.mysql;

import _03.ch07.domain.userinfo.UserInfo;
import _03.ch07.domain.userinfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("INSERT INTO MYSQL DB userId = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("UPDATE INTO MYSQL DB userId = " + userInfo.getUserId());

    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("DELETE FROM MYSQL DB userId = " + userInfo.getUserId());

    }
}
