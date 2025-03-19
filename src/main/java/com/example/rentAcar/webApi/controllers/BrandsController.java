package com.example.rentAcar.webApi.controllers;


import com.example.rentAcar.business.abstracts.BrandService;
import com.example.rentAcar.business.requests.CreateBrandRequest;
import com.example.rentAcar.business.requests.UpdateBrandRequest;
import com.example.rentAcar.business.responses.GetAllBrandsResponse;
import com.example.rentAcar.business.responses.GetByIdBrandResponse;
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
@GetMapping("/{id}")
public GetByIdBrandResponse getById(@PathVariable int id){
    return brandService.getById(id);
}

@PostMapping()
@ResponseStatus(code=HttpStatus.CREATED)
public void add(@RequestBody() CreateBrandRequest createBrandRequest, HttpMethod httpMethod) {
    this.brandService.add(createBrandRequest);
}

@PutMapping
public void update(@RequestBody() UpdateBrandRequest updateBrandRequest) {
    this.brandService.update(updateBrandRequest);
}

@DeleteMapping
public void delete(@PathVariable int id) {
    this.brandService.delete(id);
}

}
