package hello.core1;


import hello.core1.Order.OrderService;
import hello.core1.Order.OrderServiceImpl;
import hello.core1.discount.DiscountPolicy;
import hello.core1.discount.FixDiscountPolicy;
import hello.core1.member.MemberRepository;
import hello.core1.member.MemberService;
import hello.core1.member.MemberServiceImpl;
import hello.core1.member.MemoryMemberRepository;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    private MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(),discountPolicy());
    }

    public DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }


}
