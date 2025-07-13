package hello.core1.discount2;

import hello.core1.member2.Grade2;
import hello.core1.member2.Member2;

public class RateDiscountPolicy2 implements DiscountPolicy2 {
    private int discountPercent = 10;


    @Override
    public int discount(Member2 member, int price) {
        if(member.getGrade() == Grade2.VIP) {
            return price * discountPercent/100;

        }
        else {
            return 0;
        }
    }

}
