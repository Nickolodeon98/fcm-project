package com.example.fcmproject.domain.dto;

import com.example.fcmproject.domain.entity.PracticeEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PracticeResponseDto {
  Long id;
  String name;

  public static PracticeResponseDto of(PracticeEntity p) {
    return PracticeResponseDto.builder().id(p.getId()).name(p.getName()).build();
  }

  public PracticeEntity toEntity() {
    return PracticeEntity.builder().id(id).name(name).build();
  }
}
