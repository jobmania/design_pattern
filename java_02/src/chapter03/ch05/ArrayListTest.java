package chapter03.ch05;

public class ArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();

        Member member1 = new Member(12, "엄준식");
        Member member121 = new Member(123, "엄준식2");
        Member member15 = new Member(124, "엄준식3");
        Member member161 = new Member(125, "엄준식4");
        Member member171 = new Member(126, "엄준식5");

        memberArrayList.addMember(member1);
        memberArrayList.addMember(member121);
        memberArrayList.addMember(member15);
        memberArrayList.addMember(member161);
        memberArrayList.addMember(member171);
        memberArrayList.addMember(member1);

        memberArrayList.removeMember(12);
        memberArrayList.showAllMembers();  // 순서 보장! 중복 보장 x
        System.out.println("=======");
        memberArrayList.removeMember(999);
        memberArrayList.showAllMembers();  // 순서 보장! 중복 보장
    }
}
