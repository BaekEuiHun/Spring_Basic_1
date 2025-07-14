package hello.core1.beanfind2;

import hello.core1.AppConfig2;
import hello.core1.member2.MemberService2;
import hello.core1.member2.MemberServiceImpl2;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextBasicFindTest2 {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig2.class);

    @Test
    @DisplayName("빈 이름으로 조회")
    void findBeanByName() {
        MemberService2 memberService2 = ac.getBean("memberService2", MemberService2.class);
        System.out.println("memberService2 = " + memberService2);
        System.out.println("memberService2 = " + memberService2.getClass());
        Assertions.assertThat(memberService2).isInstanceOf(MemberServiceImpl2.class);
    }

    @Test
    @DisplayName("이름없이 타입으로만 조회")
    void findBeanByType() {
        MemberService2 memberService2 = ac.getBean(MemberService2.class);
        System.out.println("memberService2 = " + memberService2);
        System.out.println("memberService2 = " + memberService2.getClass());
        Assertions.assertThat(memberService2).isInstanceOf(MemberServiceImpl2.class);
    }

    @Test
    @DisplayName("구체 타입으로 조회")
    void findBeanByName2() {
        MemberService2 memberService2 = ac.getBean("memberService2", MemberServiceImpl2.class);
        System.out.println("memberService2 = " + memberService2);
        System.out.println("memberService2 = " + memberService2.getClass());
        Assertions.assertThat(memberService2).isInstanceOf(MemberServiceImpl2.class);
        
    }

}
