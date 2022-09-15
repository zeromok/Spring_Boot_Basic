package OOP03.Interface.ch13.domain.userInfo.dao.oracle;

import OOP03.Interface.ch13.domain.userInfo.UserInfo;
import OOP03.Interface.ch13.domain.userInfo.dao.UserInfoDao;

// 인터페이스를 활용한 다형성 구현 (DAO 구현)
/*
DB 에 회원정보를 넣고/수정/삭제 하는 DAO 를 여러 DB 제품이 지원될 수 있게 구현
환경파일(properties)에서 DB 종류를 읽고 그 정보에 맞게 dao 인스턴스를 생성해 실행될 수 있게 함
*/
public class UserInfoOracleSqlDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into Oracle DB userID = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update into Oracle DB userID = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete into Oracle DB userID = " + userInfo.getUserId());
    }
}
