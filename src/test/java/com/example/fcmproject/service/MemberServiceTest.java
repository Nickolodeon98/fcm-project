package com.example.fcmproject.service;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import com.example.fcmproject.domain.entity.Member;
import com.example.fcmproject.repository.MemberRepository;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.aspectj.lang.annotation.After;
import org.hibernate.metamodel.internal.MemberResolver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@AllArgsConstructor
class MemberServiceTest {

  private final MemberService memberService;
  private final MemberRepository memberRepository;

  @Test
  void 회원가입() {
    //given
    Member member = new Member();
    member.setName("spring");

    //when
    Long saveId = memberService.join(member);

    //then
    Member findMember = memberService.findOne(saveId).get();
    assertThat(member.getName()).isEqualTo(findMember.getName());
  }

  @Test
  public void 중복_회원_예외() {
    //given
    Member member1 = new Member();
    member1.setName("spring");

    Member member2 = new Member();
    member2.setName("spring");

    //when
    memberService.join(member1);

    IllegalStateException e = assertThrows(IllegalStateException.class,
        () -> memberService.join(member2));

    assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
/*
    try {
      memberService.join(member2);
      fail();
    } catch (IllegalStateException e) {
      assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
    }
*/

    //then
  }
}