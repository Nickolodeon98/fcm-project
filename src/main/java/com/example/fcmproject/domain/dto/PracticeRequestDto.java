package com.example.fcmproject.domain.dto;

import com.example.fcmproject.domain.entity.PracticeEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class PracticeRequestDto {
  String name;

  public PracticeEntity toEntity() {
    return PracticeEntity.builder().name(name).build();
  }
}
