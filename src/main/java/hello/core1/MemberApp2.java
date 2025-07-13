package hello.core1;

import hello.core1.member2.Grade2;
import hello.core1.member2.Member2;
import hello.core1.member2.MemberService2;
import hello.core1.member2.MemberServiceImpl2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp2 {

    public static void main(String[] args) {
//        AppConfig2 appConfig2 = new AppConfig2();
//        MemberService2 memberService2 = appConfig2.memberService2();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig2.class);
        MemberService2 memberService2 = applicationContext.getBean("memberService2", MemberService2.class);

        Member2 member = new Member2(1L, "memberA", Grade2.VIP);
        memberService2.join(member);

        Member2 findMember = memberService2.findMember(1L);
        System.out.println("new member: " + member.getName());
        System.out.println("find member: " + findMember.getName());
    }
}
