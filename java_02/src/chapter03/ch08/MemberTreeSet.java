package chapter03.ch08;



import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet  {
    private TreeSet<Member> treeSet;

    public MemberTreeSet() {
        this.treeSet = new TreeSet<>();  //  default capacity는 10개다
    }

    public void addMember(Member member){
        this.treeSet.add(member);
    }

    public boolean removeMember (int memberId){


        Iterator<Member> ir = treeSet.iterator(); // 모든 Collection에는 iterator 가 있다 ㅇㅋ

        while (ir.hasNext()){
          Member member = ir.next();
            if(member.getMemberId() == memberId){
                treeSet.remove(member); // object로 삭제
                return true;
            }
        }


        System.out.println("멤버 id 존재하지 않음 ㅅㄱ링~");
        return false;
    }
    
    public void showAllMembers(){

        Iterator<Member> ir = treeSet.iterator(); // 모든 Collection에는 iterator 가 있다 ㅇㅋ
        while (ir.hasNext()){
            System.out.println(ir.next());

        }
    }


}
