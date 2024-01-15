package com.store.car.repository;

import com.store.car.model.CarPostEntity;
import com.store.car.model.OwnerPostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface OwnerPostRepository extends JpaRepository<OwnerPostEntity, Long> {
}
