package hello.core1.member2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest2 {

    MemberService2 memberService2 = new MemberServiceImpl2();

    @Test
    void join() {

        Member2 member = new Member2(1L, "memberA", Grade2.VIP);

        memberService2.join(member);
        Member2 findMember = memberService2.findMember(1L);

        Assertions.assertThat(member).isEqualTo(findMember);

    }
}
