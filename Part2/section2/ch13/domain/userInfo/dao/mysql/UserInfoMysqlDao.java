package Part2.section2.ch13.domain.userInfo.dao.mysql;

import Part2.section2.ch13.domain.userInfo.UserInfo;
import Part2.section2.ch13.domain.userInfo.dao.UserInfoDao;

public class UserInfoMysqlDao implements UserInfoDao{

    @Override
    public void insertUserInfo(UserInfo userinfo) {
        System.out.println("Insert into Mysql userID"+ userinfo.getUserId());
    }


    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete Mysql userid"+ userInfo.getUserId());
    }
}
