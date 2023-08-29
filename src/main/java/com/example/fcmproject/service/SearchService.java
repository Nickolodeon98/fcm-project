//package com.example.fcmproject.service;
//
//import com.example.fcmproject.domain.dto.PracticeRequestDto;
//import com.example.fcmproject.domain.dto.PracticeResponseDto;
//import com.example.fcmproject.domain.entity.PracticeEntity;
//import com.example.fcmproject.repository.PracticeRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//@Service
//@RequiredArgsConstructor
//public class SearchService {
//
//  private final PracticeRepository practiceRepository;
//  public PracticeResponseDto addSomething(PracticeRequestDto p) {
//
//    PracticeEntity practiceEntity = practiceRepository.save(p.toEntity());
//
//    return PracticeResponseDto.of(practiceEntity);
//  }
//
//
//  public PracticeResponseDto findSomething(PracticeRequestDto request) {
//    PracticeEntity practiceEntity = practiceRepository.getByName(request.getName());
//
//    return PracticeResponseDto.of(practiceEntity);
//  }
//
//  public PracticeResponseDto deleteItem(PracticeRequestDto request) {
//    PracticeEntity practiceEntity = practiceRepository.getByName(request.getName());
//
//    practiceRepository.deleteById(practiceEntity.getId());
//
//    return PracticeResponseDto.of(practiceEntity);
//  }
//}
