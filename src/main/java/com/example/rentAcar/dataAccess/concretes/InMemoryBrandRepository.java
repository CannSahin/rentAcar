package com.example.rentAcar.dataAccess.concretes;

import com.example.rentAcar.dataAccess.abstracts.BrandRepository;
import com.example.rentAcar.entities.concretes.Brand;

import java.util.ArrayList;
import java.util.List;

public class InMemoryBrandRepository  implements BrandRepository {
    List<Brand> brands;
    public InMemoryBrandRepository() {
        brands = new ArrayList<Brand>();
        brands.add(new Brand(1,"Hyundai"));
        brands.add(new Brand(2,"Chevy"));
        brands.add(new Brand(3,"Fiat"));
        brands.add(new Brand(4,"Tesla"));
        brands.add(new Brand(5,"Ford"));

    }

    @Override
    public List<Brand> getAll() {
        return brands;
    }

}
