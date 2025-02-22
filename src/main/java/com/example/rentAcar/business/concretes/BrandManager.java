package com.example.rentAcar.business.concretes;

import com.example.rentAcar.business.abstracts.BrandService;
import com.example.rentAcar.dataAccess.abstracts.BrandRepository;
import com.example.rentAcar.entities.concretes.Brand;

import java.util.List;

public class BrandManager implements BrandService {
    private BrandRepository brandRepository;
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAll() {
        return brandRepository.getAll();
    }
}
