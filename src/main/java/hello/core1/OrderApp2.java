package hello.core1;

import hello.core1.member2.Grade2;
import hello.core1.member2.Member2;
import hello.core1.member2.MemberService2;
import hello.core1.member2.MemberServiceImpl2;
import hello.core1.order2.Order2;
import hello.core1.order2.OrderService2;
import hello.core1.order2.OrderServiceImpl2;

public class OrderApp2 {
    public static void main(String[] args) {
        AppConfig2 appConfig = new AppConfig2();
        MemberService2 memberService2 = appConfig.memberService2();
        OrderService2 orderService2 = appConfig.orderService2();

//        MemberService2 memberService = new MemberServiceImpl2(null);
//        OrderService2 orderService = new OrderServiceImpl2(null,null);

        Long memberId = 1L;
        Member2 member = new Member2(memberId, "memberA", Grade2.VIP);
        memberService2.join(member);

        Order2 itemA = orderService2.createOrder(memberId, "itemA", 10000);
        System.out.println("itemA = " + itemA.toString());
        System.out.println("Final Price : " + itemA.caclulatePrice());

    }
}
