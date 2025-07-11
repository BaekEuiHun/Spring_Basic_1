package hello.core1.discount2;

import hello.core1.member2.Grade2;
import hello.core1.member2.Member2;

public class FixDiscountPolicy2 implements DiscountPolicy2{


    private int discountFixAmount = 1000;

    @Override
    public int discount(Member2 member, int price) {
        if (member.getGrade() == Grade2.VIP) {
            return discountFixAmount;
        }
        return 0;
    }


}
