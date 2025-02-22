package com.example.rentAcar.dataAccess.concretes;

import com.example.rentAcar.dataAccess.abstracts.BrandRepository;
import com.example.rentAcar.entities.concretes.Brand;

import java.util.ArrayList;
import java.util.List;

public class InMemoryBrandRepository  implements BrandRepository {
    List<Brand> brands;
    public InMemoryBrandRepository() {
        brands = new ArrayList<Brand>();
    }
    @Override
    public List<Brand> getAll() {
        return null;
    }

}
