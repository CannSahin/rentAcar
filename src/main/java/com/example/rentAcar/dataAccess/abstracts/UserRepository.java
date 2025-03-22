package com.example.rentAcar.dataAccess.abstracts;


import com.example.rentAcar.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
