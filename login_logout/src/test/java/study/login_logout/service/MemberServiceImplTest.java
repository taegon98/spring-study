package study.login_logout.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import study.login_logout.dto.MemberDTO;
import study.login_logout.entity.Member;
import study.login_logout.repository.MemberRepository;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberServiceImplTest{
    MemberService memberService = new MemberServiceImpl();
    @Autowired
    private MemberRepository memberRepository;
    
    @Test
    void register() {
        MemberDTO memberDTO = MemberDTO.builder("taegon","1234")
                .name("lee")
                .build();
        Member member = memberService.dtoToEntity(memberDTO);
        memberRepository.save(member);
    }
}