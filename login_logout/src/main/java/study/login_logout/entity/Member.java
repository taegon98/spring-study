package study.login_logout.entity;

import lombok.*;
import study.login_logout.dto.MemberDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@Entity
@NoArgsConstructor
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String userId;

    @NotNull
    private String password;

    @NotNull
    private String name;

    @Builder(builderMethodName = "customBuilder")
    public Member(String userId, String password, String name) {
        this.userId = userId;
        this.password = password;
        this.name = name;
    }

    public static Member.MemberBuilder builder(String userId, String password) {
        return customBuilder()
                .userId(userId)
                .password(password);
    }
}
