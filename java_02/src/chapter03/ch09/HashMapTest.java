package chapter03.ch09;

import chapter03.ch09.Member;

public class HashMapTest {
    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();


        Member member1 = new Member(1001, "엄준식");
        Member member2 = new Member(1002, "김식");
        Member member3 = new Member(1003, "나준식");
        Member member4 = new Member(1005, "다준식");

        memberHashMap.addMember(member1);
        memberHashMap.addMember(member2);
        memberHashMap.addMember(member3);
        memberHashMap.addMember(member4);


        memberHashMap.removeMember(1005);
        memberHashMap.showAllMember();


        System.out.println("===================");
    }
}
