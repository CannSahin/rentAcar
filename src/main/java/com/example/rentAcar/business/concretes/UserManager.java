package com.example.rentAcar.business.concretes;

import com.example.rentAcar.business.abstracts.UserService;
import com.example.rentAcar.business.requests.CreateUserRequest;
import com.example.rentAcar.business.responses.GetAllBrandsResponse;
import com.example.rentAcar.business.responses.GetAllUsersResponse;
import com.example.rentAcar.core.utilities.mappers.ModelMapperService;
import com.example.rentAcar.dataAccess.abstracts.UserRepository;
import com.example.rentAcar.entities.concretes.Brand;
import com.example.rentAcar.entities.concretes.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserManager implements UserService {

private UserRepository userRepository;
private ModelMapperService modelMapperService;
@Override
public List<GetAllUsersResponse> getAll() {

    List<User> users = userRepository.findAll();


    List<GetAllUsersResponse> usersResponses =users.stream()
            .map(user -> this.modelMapperService.forResponse()
                    .map(user, GetAllUsersResponse.class)).collect(Collectors.toList());

    return usersResponses;
}

    @Override
    public void addUser(CreateUserRequest createUserRequest) {
        User user=this.modelMapperService.forRequest().map(createUserRequest, User.class);
        this.userRepository.save(user);
    }


}
