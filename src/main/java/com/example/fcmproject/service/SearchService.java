package com.example.fcmproject.service;

import com.example.fcmproject.domain.dto.PracticeResponseDto;
import com.example.fcmproject.domain.entity.PracticeEntity;
import com.example.fcmproject.repository.PracticeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SearchService {

  private final PracticeRepository practiceRepository;
  public PracticeResponseDto getSomething(String name) {
    PracticeEntity p = practiceRepository.getByName(name);

    return PracticeResponseDto.of(p);
  }


}
