package hj.Interest.Existence.domain.member.repository;

import hj.Interest.Existence.domain.member.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
    MemberEntity findById(String MemberId);
}
