package com.example.rentAcar.business.abstracts;

import com.example.rentAcar.business.requests.CreateBrandRequest;
import com.example.rentAcar.business.requests.CreateUserRequest;
import com.example.rentAcar.business.responses.GetAllBrandsResponse;
import com.example.rentAcar.business.responses.GetAllUsersResponse;
import com.example.rentAcar.business.responses.GetByIdBrandResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<GetAllUsersResponse> getAll();
    void addUser(CreateUserRequest createUserRequest);


}
