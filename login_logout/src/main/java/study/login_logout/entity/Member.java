package study.login_logout.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Member {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String userId;

    @NotNull
    private String password;

    @NotNull
    private String name;
}
