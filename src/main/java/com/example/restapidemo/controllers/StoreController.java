package com.example.restapidemo.controllers;

import com.example.restapidemo.domain.Store;
import com.example.restapidemo.service.store.StoreService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(StoreController.BASE_URL)
public class StoreController {
    public static final String BASE_URL = "/api/v1/Stores";
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping
    public List<Store> getAllStores(){
        return storeService.findAllStores();
    }

    @GetMapping("/{id}")
    public Store getStoreById(@PathVariable Long id){
        return storeService.findStoreById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Store saveStore(Store store){
        return storeService.saveStore(store);
    }
}
