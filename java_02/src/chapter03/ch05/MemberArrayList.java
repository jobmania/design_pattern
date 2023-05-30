package chapter03.ch05;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
    private ArrayList<Member> arrayList;

    public MemberArrayList() {
        this.arrayList = new ArrayList<>();  //  default capacity는 10개다
    }

    public void addMember(Member member){
        this.arrayList.add(member);
    }

    public boolean removeMember (int memberId){
//        for (int i = 0; i < arrayList.size(); i++) {
//            Member member = arrayList.get(i);
//            if(member.getMemberId() == memberId){
//                arrayList.remove(i);
//                return true;
//            }
//        }


        Iterator<Member> ir = arrayList.iterator(); // 모든 Collection에는 iterator 가 있다 ㅇㅋ

        while (ir.hasNext()){
            Member member = ir.next();
            if(member.getMemberId() == memberId){
                arrayList.remove(member); // object로 삭제
                return true;
            }
        }


        System.out.println("멤버 id 존재하지 않음 ㅅㄱ링~");
        return false;
    }
    
    public void showAllMembers(){
//        for (int i = 0; i < arrayList.size(); i++) {
//            Member member = arrayList.get(i);
//            System.out.println(member);
//        }
        Iterator<Member> ir = arrayList.iterator(); // 모든 Collection에는 iterator 가 있다 ㅇㅋ
        while (ir.hasNext()){
            System.out.println(ir.next());

        }
    }
}
