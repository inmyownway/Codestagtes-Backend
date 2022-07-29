package Part2.section2.ch13.domain.userInfo.dao;

import Part2.section2.ch13.domain.userInfo.UserInfo;

public interface UserInfoDao {
    void insertUserInfo(UserInfo userinfo);
    void deleteUserInfo(UserInfo userInfo);

}
