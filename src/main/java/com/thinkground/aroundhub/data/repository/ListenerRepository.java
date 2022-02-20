package com.thinkground.aroundhub.data.repository;

import com.thinkground.aroundhub.data.entity.ListenerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListenerRepository extends JpaRepository<ListenerEntity, Long> {
}
