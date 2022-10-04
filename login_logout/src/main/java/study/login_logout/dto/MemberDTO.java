package study.login_logout.dto;

import lombok.*;
import study.login_logout.entity.Member;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
public class MemberDTO {
    private Long id;
    @NotNull
    private String userId;
    @NotNull
    private String password;
    @NotNull
    private String name;

    @Builder(builderMethodName = "customBuilder")
    public MemberDTO(String userId, String password, String name) {
        this.userId = userId;
        this.password = password;
        this.name = name;
    }

    public static MemberDTOBuilder builder(String userId, String password) {
        return customBuilder()
                .userId(userId)
                .password(password);
    }
}

