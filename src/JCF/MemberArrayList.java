package JCF;

import java.util.ArrayList;

public class MemberArrayList {

    private ArrayList<Member> arrayList;
    // 데이터 타입 : Member 인 ArrayList 선언

    public MemberArrayList() {

        arrayList = new ArrayList<>();

    }// 기본 생성자

    public void addMember(Member member) {

        arrayList.add(member);

    }// add 메소드

    // 삭제 메소드
    public boolean removeMember(int memberId) {

        // for 문으로 순회하면서 들어온 memberId 와 비교
        for( int i=0; i<arrayList.size(); i++) {

            // 인덱스 값을 반환해주는 메소드
            Member member = arrayList.get(i);

            // member 의 Id 를 반환해주는 메소드
            int tempId = member.getMemberId();

            if(tempId == memberId) {

                arrayList.remove(i);
                System.out.println(member.getMemberName() + "님이 제거되었습니다.");
                return true;

            }// if

        }// for

        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;

    }

    // 인핸스 for 문을 사용해 arrayList 의 값들을 member 에 넣어 출력
    public void showAllMember(){
        for(Member member : arrayList){
            System.out.println(member);
        }
        System.out.println();
    }


}
