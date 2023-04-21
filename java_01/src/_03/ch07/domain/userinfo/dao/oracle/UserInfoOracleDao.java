package _03.ch07.domain.userinfo.dao.oracle;

import _03.ch07.domain.userinfo.UserInfo;
import _03.ch07.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("INSERT INTO ORACLE DB userId = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("UPDATE INTO ORACLE DB userId = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("DELETE FROM ORACLE DB userId = " + userInfo.getUserId());
    }
}
