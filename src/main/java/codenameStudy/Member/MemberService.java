package codenameStudy.Member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public Member create(String name, String pwd) {
        Member member = new Member();
        member.setName(name);
        member.setPwd(pwd);

        memberRepository.save(member);

        return member;
    }
}
