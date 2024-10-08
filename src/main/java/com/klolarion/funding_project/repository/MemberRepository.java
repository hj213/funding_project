package com.klolarion.funding_project.repository;

import com.klolarion.funding_project.domain.entity.Member;
import com.klolarion.funding_project.domain.entity.PaymentMethodList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByAccount(String account);

    Optional<Member> findByEmail(String account);
}
