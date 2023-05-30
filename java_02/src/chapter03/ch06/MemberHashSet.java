package chapter03.ch06;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
    private HashSet<Member> hashSet;

    public MemberHashSet() {
        this.hashSet = new HashSet<>();  //  default capacity는 10개다
    }

    public void addMember(Member member){
        this.hashSet.add(member);
    }

    public boolean removeMember (int memberId){
//        for (int i = 0; i < arrayList.size(); i++) {
//            Member member = arrayList.get(i);
//            if(member.getMemberId() == memberId){
//                arrayList.remove(i);
//                return true;
//            }
//        }


        Iterator<Member> ir = hashSet.iterator(); // 모든 Collection에는 iterator 가 있다 ㅇㅋ

        while (ir.hasNext()){
           Member member = ir.next();
            if(member.getMemberId() == memberId){
                hashSet.remove(member); // object로 삭제
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
        Iterator<Member> ir = hashSet.iterator(); // 모든 Collection에는 iterator 가 있다 ㅇㅋ
        while (ir.hasNext()){
            System.out.println(ir.next());

        }
    }
}
