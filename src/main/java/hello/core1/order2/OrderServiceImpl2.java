package hello.core1.order2;

import hello.core1.discount2.DiscountPolicy2;
import hello.core1.discount2.FixDiscountPolicy2;
import hello.core1.member2.Member2;
import hello.core1.member2.MemberRepository2;
import hello.core1.member2.MemoryMemberRepository2;

public class OrderServiceImpl2 implements OrderService2 {


    private final MemberRepository2 memberRepository;
    private final DiscountPolicy2 discountPolicy;

    public OrderServiceImpl2(MemberRepository2 memberRepository, DiscountPolicy2 discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order2 createOrder(Long memberId, String itemName, int itemPrice) {

        Member2 member = memberRepository.findById(memberId);

        int discountPrice = discountPolicy.discount(member,itemPrice);

        return new Order2(memberId,itemName,itemPrice,discountPrice);


    }


}
