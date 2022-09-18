package JCF;

public class MemberArrayListTest {

    public static void main(String[] args) {

        // member 들을 넣을 ArrayList 생성
        MemberArrayList memberArrayList = new MemberArrayList();

        // member 생성
        Member memberLee = new Member(1001, "이순신");
        Member memberKim = new Member(1002, "김유신");
        Member memberKang = new Member(1003, "강감찬");
        Member memberHong = new Member(1004, "홍길동");

        // ArrayList 에 member 추가
        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberKim);
        memberArrayList.addMember(memberKang);
        memberArrayList.addMember(memberHong);

        memberArrayList.showAllMember();

        memberArrayList.removeMember(memberHong.getMemberId());

        memberArrayList.showAllMember();


    }
}
