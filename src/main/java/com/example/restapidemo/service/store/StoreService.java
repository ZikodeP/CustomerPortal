package com.example.restapidemo.service.store;

import com.example.restapidemo.domain.Store;

import java.util.List;

public interface StoreService {
    Store findStoreById(Long id);
    List<Store> findAllStores();
    Store saveStore(Store store);
}
