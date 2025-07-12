package hello.core1;

import hello.core1.discount2.FixDiscountPolicy2;
import hello.core1.member2.Member2;
import hello.core1.member2.MemberService2;
import hello.core1.member2.MemberServiceImpl2;
import hello.core1.member2.MemoryMemberRepository2;
import hello.core1.order2.OrderService2;
import hello.core1.order2.OrderServiceImpl2;

public class AppConfig2 {

    public MemberService2 memberService2() {
        return new MemberServiceImpl2(new MemoryMemberRepository2());
    }

    public OrderService2 orderService2() {
        return new OrderServiceImpl2(new MemoryMemberRepository2(),new FixDiscountPolicy2());
    }


}
