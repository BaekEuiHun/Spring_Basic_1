package hello.core1.member2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceImpl2 implements MemberService2 {

    private final MemberRepository2 memberRepository;

    @Autowired
    public MemberServiceImpl2(MemberRepository2 memberRepository) {
        this.memberRepository = memberRepository;
    }


    @Override
    public void join(Member2 member) {
        memberRepository.save(member);

    }

    
    @Override
    public Member2 findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
