package com.example.rentAcar.business.responses;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllUsersResponse {
    private int id;
    private int user_id;
    private String name;
    private String email;
    private int tel_no;
}
