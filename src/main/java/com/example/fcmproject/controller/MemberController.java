package com.example.fcmproject.controller;

import com.example.fcmproject.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

  private final MemberService memberService;

/* 생성자의 멤버 서비스를 스프링이 가져다가 연결해준다. */
  @Autowired
  public MemberController(MemberService memberService) {
    this.memberService = memberService;
  }
}
