package hello.core1.member2;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository2 implements MemberRepository2 {

    private static Map<Long, Member2> store = new HashMap<>();

    @Override
    public void save(Member2 member) {

        store.put(member.getId(), member);
    }

    @Override
    public Member2 findById(Long memberId) {

        return store.get(memberId);
    }
}