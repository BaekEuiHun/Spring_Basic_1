package hello.core1.member;

public interface MemberRepository {



    void save(Member member);


    Member findById(Long memberId);



}
