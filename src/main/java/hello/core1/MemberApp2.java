package hello.core1;

import hello.core1.member2.Grade2;
import hello.core1.member2.Member2;
import hello.core1.member2.MemberService2;
import hello.core1.member2.MemberServiceImpl2;

public class MemberApp2 {

    public static void main(String[] args) {

        MemberService2 memberService = new MemberServiceImpl2();
        Member2 member = new Member2(1L, "memberA", Grade2.VIP);
        memberService.join(member);

        Member2 findMember = memberService.findMember(1L);
        System.out.println("new member: " + member.getName());
        System.out.println("find member: " + findMember.getName());
    }
}
