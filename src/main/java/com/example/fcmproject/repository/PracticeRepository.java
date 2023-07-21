package com.example.fcmproject.repository;

import com.example.fcmproject.domain.entity.PracticeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PracticeRepository extends JpaRepository<PracticeEntity, Long> {

  PracticeEntity getByName(String name);
}
