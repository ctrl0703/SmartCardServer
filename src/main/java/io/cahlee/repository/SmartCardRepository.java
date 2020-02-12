package io.cahlee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.cahlee.domain.SmartCard;

@Repository
public interface SmartCardRepository extends JpaRepository<SmartCard, Long> {

}
