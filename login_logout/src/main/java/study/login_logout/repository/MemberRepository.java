package study.login_logout.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import study.login_logout.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}
