package com.example.rentAcar.business.abstracts;

import com.example.rentAcar.business.requests.CreateBrandRequest;
import com.example.rentAcar.business.responses.GetAllBrandsResponse;
import com.example.rentAcar.entities.concretes.Brand;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BrandService {
List<GetAllBrandsResponse> getAll();
void add(CreateBrandRequest createBrandRequest);
}
