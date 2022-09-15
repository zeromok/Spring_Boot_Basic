package OOP03.Interface.ch13.web.userInfo;

import OOP03.Interface.ch13.domain.userInfo.UserInfo;
import OOP03.Interface.ch13.domain.userInfo.dao.UserInfoDao;
import OOP03.Interface.ch13.domain.userInfo.dao.mysql.UserInfoMySqlDao;
import OOP03.Interface.ch13.domain.userInfo.dao.oracle.UserInfoOracleSqlDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

// 인터페이스를 활용한 다형성 구현 (DAO 구현)
/*
DB 에 회원정보를 넣고/수정/삭제 하는 DAO 를 여러 DB 제품이 지원될 수 있게 구현
환경파일(properties)에서 DB 종류를 읽고 그 정보에 맞게 dao 인스턴스를 생성해 실행될 수 있게 함
*/
public class UserInfoClient {

    public static void main(String[] args) throws IOException {
        // UserInfoDao 인터페이스를 활요하는 클라이언트 프로그램

        FileInputStream fis = new FileInputStream("src/OOP03/Interface/ch13/db.properties");
        // properties 파일을 불러온다. Content Root 경로 지정

        Properties prop = new Properties();
        prop.load(fis);
        // 불러온 properties 파일을 읽을 수 있다.

        String dbType = prop.getProperty("DBTYPE");
        // 키=값 으로 이루어져있는 속성을 읽어 온다.

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("12345");
        userInfo.setPassword("123123");
        userInfo.setUserName("Lee");
        // 데이터 정보를 하드코딩 한다.

        UserInfoDao userInfoDao = null;

        if(dbType.equals("ORACLE")) {
            userInfoDao = new UserInfoOracleSqlDao();
        } else if(dbType.equals("MYSQL")) {
            userInfoDao = new UserInfoMySqlDao();
        } else {
            System.out.println("db error");
            return;
        }

        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);

    }
}
