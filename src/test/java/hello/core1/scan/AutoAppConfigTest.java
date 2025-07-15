package hello.core1.scan;


import hello.core1.AutoAppConfig;
import hello.core1.member2.MemberService2;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoAppConfigTest {

    @Test
    void basicScan() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class);
        MemberService2 memberService = ac.getBean(MemberService2.class);
        Assertions.assertThat(memberService).isInstanceOf(MemberService2.class);
    }
}
