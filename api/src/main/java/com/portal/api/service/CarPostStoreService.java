package com.portal.api.service;

import com.portal.api.dtos.CarPostDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CarPostStoreService {

    List<CarPostDTO> getCarForSales();
    void changeCarForSale(CarPostDTO carPostDTO, String id);
    void removeCarForSale(String id);
}
