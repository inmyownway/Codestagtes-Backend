package Part2.section2.ch13.WebUserinfo;

import Part2.section2.ch13.domain.userInfo.UserInfo;
import Part2.section2.ch13.domain.userInfo.dao.UserInfoDao;
import Part2.section2.ch13.domain.userInfo.dao.mysql.UserInfoMysqlDao;
import Part2.section2.ch13.domain.userInfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClinet {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("db.p");

        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");

        UserInfo userinfo = new UserInfo();
        userinfo.setUserId("ada");
        UserInfoDao userInfoDao = null;
        if(dbType.equals("ORACLE"))
            userInfoDao = new UserInfoOracleDao();
        else if(dbType.equals("MYSQL"))
            userInfoDao = new UserInfoMysqlDao();
        else
        {
            System.out.println("db error");
            return;
        }
        userInfoDao.deleteUserInfo(userinfo);
    }
}
