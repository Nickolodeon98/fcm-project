package com.example.fcmproject.controller;

import com.example.fcmproject.domain.dto.PracticeResponseDto;
import com.example.fcmproject.domain.dto.PracticeRequestDto;
import com.example.fcmproject.domain.entity.PracticeEntity;
import com.example.fcmproject.service.SearchService;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/search")
@RequiredArgsConstructor
public class SearchController {

  private final SearchService searchService;

  @ResponseBody
  @PostMapping("")
  public ResponseEntity<PracticeResponseDto> addItem(@RequestBody PracticeRequestDto request) {

    Optional<PracticeResponseDto> optPracticeDto = Optional.of(searchService.addSomething(request));

    return ResponseEntity.of(optPracticeDto);
  }

  @ResponseBody
  @GetMapping("/fetch")
  public ResponseEntity<PracticeResponseDto> findItem(@RequestBody PracticeRequestDto request) {
    Optional<PracticeResponseDto> optPracticeDto = Optional.of(searchService.findSomething(request));

    return ResponseEntity.of(optPracticeDto);
  }

//  @ResponseBody
//  @DeleteMapping("/remove/{postId}")
//  public ResponseEntity<PracticeResponseDto> deleteItem(@PathVariable Integer postId) {
//    Optional<PracticeResponseDto> optPracticeDto = Optional.of(searchService.findSomething(postId));
//
//    searchService.deleteItem();
//
//    return ResponseEntity.of(optPracticeDto);
//  }

  @ResponseBody
  @GetMapping("practice-api")
  public Hello hello(@RequestParam("name") String name) {
    Hello hello = new Hello();
    hello.setName(name);
    return hello;
  }

  static class Hello {
    private String name;

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }
  }
}
