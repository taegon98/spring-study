package study.login_logout.service;

import org.springframework.stereotype.Service;
import study.login_logout.dto.MemberDTO;
import study.login_logout.entity.Member;

public interface MemberService {
    Long register(MemberDTO dto);

    default Member dtoToEntity(MemberDTO dto) {
        Member entity = Member.builder(dto.getUserId(), dto.getPassword())
                .name(dto.getName())
                .build();
        return entity;
    }
}
