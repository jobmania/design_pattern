package chapter03.ch06;


public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();
        Member member1 = new Member(1, "엄2");
        Member member2 = new Member(2, "엄3");
        Member member3 = new Member(3, "엄4");
        Member member4 = new Member(4, "엄5");
        Member member5 = new Member(5, "엄동일");

        memberHashSet.addMember(member1);
        memberHashSet.addMember(member2);
        memberHashSet.addMember(member3);
        memberHashSet.addMember(member4);
        memberHashSet.addMember(member5);
        memberHashSet.showAllMembers();

        Member member52 = new Member(5, "엄동일"); // 객체에 동일한 데이터가 들어가도 걸러지지 못햇음
        memberHashSet.addMember(member52);
        System.out.println("=========");
        memberHashSet.showAllMembers();

    }
}
