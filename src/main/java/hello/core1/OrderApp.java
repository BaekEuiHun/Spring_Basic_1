package hello.core1;

import hello.core1.Order.Order;
import hello.core1.Order.OrderService;
import hello.core1.Order.OrderServiceImpl;
import hello.core1.member.Grade;
import hello.core1.member.Member;
import hello.core1.member.MemberService;
import hello.core1.member.MemberServiceImpl;
import hello.core1.Order.Order;
import hello.core1.Order.OrderService;
import hello.core1.Order.OrderServiceImpl;
import hello.core1.member.Grade;
import hello.core1.member.Member;
import hello.core1.member.MemberService;
import hello.core1.member.MemberServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);
        Order order = orderService.createOrder(memberId, "itemA", 10000);
        System.out.println("order = " + order);

    }
}