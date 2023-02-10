package com.example.restapidemo.repository;

import com.example.restapidemo.domain.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long> {
}
