package com.example.rentAcar.dataAccess.abstracts;

import com.example.rentAcar.entities.concretes.Brand;

import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Integer> {

}
