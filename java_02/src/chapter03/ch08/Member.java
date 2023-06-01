package chapter03.ch08;

import java.util.Objects;

public class Member implements Comparable<Member> {
    private int memberId;
    private String memberName;

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }


    @Override
    public String toString() {
        return "member{" +
                "아이디는=" + memberId +
                ", 이름은 ='" + memberName + '\'' +
                '}';
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return memberId == member.memberId && Objects.equals(memberName, member.memberName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberId, memberName); // id와 이름이 같으면 같은 객체를 반환한다
    }

    @Override
    public int compareTo(Member member) {
        // 회원의 아이디 순으로 정렬 할 예정 (오름차순 default , 내리차순은 * -1)
//        return (this.memberId - member.getMemberId());

        // 회원의 이름순으로 정렬 ( 오름차순)
        return (this.memberName.compareTo(member.getMemberName()));

    }
}
