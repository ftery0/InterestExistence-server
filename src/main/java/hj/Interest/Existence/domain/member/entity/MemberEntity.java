package hj.Interest.Existence.domain.member.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "tb_member")

public class MemberEntity {
    @Id
    @Column(name = "member_id")
    private Long id;

    @Column(name = "member_name")
    private String username;

    @Column(name = "member_password")
    private String password;

    @Column(name = "member_email")
    private String email;

}
