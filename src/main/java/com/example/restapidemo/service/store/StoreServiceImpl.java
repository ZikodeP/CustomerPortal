package com.example.restapidemo.service.store;

import com.example.restapidemo.domain.Store;
import com.example.restapidemo.repository.StoreRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {
    private final StoreRepository storeRepository;

    public StoreServiceImpl(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }
    @Override
    public Store findStoreById(Long id) {
        return storeRepository.findById(id).get();
    }
    @Override
    public List<Store> findAllStores() {
        return storeRepository.findAll();
    }
    @Override
    public Store saveStore(Store store) {
        return storeRepository.save(store);
    }
}
