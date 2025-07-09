package hello.core1;


import hello.core1.Order.OrderService;
import hello.core1.Order.OrderServiceImpl;
import hello.core1.discount.FixDiscountPolicy;
import hello.core1.member.MemberService;
import hello.core1.member.MemberServiceImpl;
import hello.core1.member.MemoryMemberRepository;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(),new FixDiscountPolicy());
    }





}
