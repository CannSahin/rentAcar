package com.example.rentAcar.webApi.controllers;

import com.example.rentAcar.business.abstracts.UserService;
import com.example.rentAcar.business.requests.CreateUserRequest;
import com.example.rentAcar.business.responses.GetAllUsersResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UsersController {
    private final UserService userService;

    @GetMapping()
    public List<GetAllUsersResponse> getAll(){
        return userService.getAll();
    }
    @PostMapping()
    @ResponseStatus(code= HttpStatus.CREATED)
    public void addUser(@RequestBody() CreateUserRequest createUserRequest, HttpMethod httpMethod) {
        this.userService.addUser(createUserRequest);
    }


}
