package com.example.fcmproject.repository;

import com.example.fcmproject.domain.entity.Member;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public interface MemberRepository extends JpaRepository<Member, Long> {
//  Member save(Member member);
//  Optional<Member> findById(Long id);
  Optional<Member> findByName(String name);
//  List<Member> findAll();
}
