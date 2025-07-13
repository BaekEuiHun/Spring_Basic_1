package hello.core1;

import hello.core1.discount2.DiscountPolicy2;
import hello.core1.discount2.FixDiscountPolicy2;
import hello.core1.member2.*;
import hello.core1.order2.OrderService2;
import hello.core1.order2.OrderServiceImpl2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig2 {

    @Bean
    public MemberService2 memberService2() {
        return new MemberServiceImpl2(memberRepository2());
    }
    @Bean
    public MemberRepository2 memberRepository2() {
        return new MemoryMemberRepository2();
    }

    @Bean
    public OrderService2 orderService2() {
        return new OrderServiceImpl2(memberRepository2(),discountPolicy2());
    }
    @Bean
    public DiscountPolicy2 discountPolicy2() {
        return new FixDiscountPolicy2();
    }


}
