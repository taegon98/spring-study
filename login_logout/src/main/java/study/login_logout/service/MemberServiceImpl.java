package study.login_logout.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import study.login_logout.dto.MemberDTO;
import study.login_logout.entity.Member;
import study.login_logout.repository.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService{

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public Long register(MemberDTO dto) {
        Member entity = dtoToEntity(dto);
        memberRepository.save(entity);
        return entity.getId();
    }
}
