package com.example.rentAcar.webApi.controllers;


import com.example.rentAcar.business.abstracts.BrandService;
import com.example.rentAcar.business.requests.CreateBrandRequest;
import com.example.rentAcar.business.responses.GetAllBrandsResponse;
import com.example.rentAcar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springdoc.core.service.RequestBodyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
@AllArgsConstructor
public class BrandsController {

private BrandService brandService;

@GetMapping()
public List<GetAllBrandsResponse> getAll(){

    return brandService.getAll();
}

@PostMapping()
@ResponseStatus(code=HttpStatus.CREATED)
public void add(@RequestBody() CreateBrandRequest createBrandRequest, HttpMethod httpMethod) {
    this.brandService.add(createBrandRequest);
}


}
