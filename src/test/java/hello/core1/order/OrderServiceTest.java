package hello.core1.order;

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
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {
    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder() {
        long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);
        Order order = orderService.createOrder(memberId, "itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}