package com.example.fcmproject.controller;

import com.example.fcmproject.domain.dto.PracticeResponseDto;
import com.example.fcmproject.domain.dto.PracticeRequestDto;
import com.example.fcmproject.domain.entity.PracticeEntity;
import com.example.fcmproject.service.SearchService;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/search")
@RequiredArgsConstructor
public class SearchController {

  private final SearchService searchService;

  @ResponseBody
  @GetMapping("")
  public ResponseEntity<PracticeResponseDto> addItem(@RequestBody PracticeRequestDto request) {

    Optional<PracticeResponseDto> optPracticeDto = Optional.of(searchService.addSomething(request));

    return ResponseEntity.of(optPracticeDto);
  }

}
