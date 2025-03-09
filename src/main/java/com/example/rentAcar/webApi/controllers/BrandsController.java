package com.example.rentAcar.webApi.controllers;


import com.example.rentAcar.business.abstracts.BrandService;
import com.example.rentAcar.business.requests.CreateBrandRequest;
import com.example.rentAcar.business.responses.GetAllBrandsResponse;
import com.example.rentAcar.entities.concretes.Brand;
import org.springdoc.core.service.RequestBodyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandsController {

    private final RequestBodyService requestBodyService;
    private BrandService brandService;
@Autowired
public BrandsController(BrandService brandService, RequestBodyService requestBodyService) {
    this.brandService = brandService;
    this.requestBodyService = requestBodyService;
}
@GetMapping("/getall")
public List<GetAllBrandsResponse> getAll(){

    return brandService.getAll();
}

@PostMapping("/add")
public void add(CreateBrandRequest createBrandRequest) {
    this.brandService.add(createBrandRequest);
}


}
