package com.example.rentAcar.dataAccess.abstracts;

import com.example.rentAcar.entities.concretes.Brand;

import java.util.List;


public interface BrandRepository {
    List<Brand> getAll();
}
