package chapter03.ch08;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member member1 = new Member(1001, "엄준식");
        Member member2 = new Member(1002, "김식");
        Member member3 = new Member(1003, "나준식");
        Member member4 = new Member(1005, "다준식");

        memberTreeSet.addMember(member1);
        memberTreeSet.addMember(member2);
        memberTreeSet.addMember(member3);
        memberTreeSet.addMember(member4);

        // Treeset구조는 add 할때 비교하면서 넣어야 되는데 관련 interface가 없다.
        memberTreeSet.showAllMembers();
    }
}
