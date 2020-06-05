package ua.opu.pnit.Lab_6_7.repository.retrofit.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthRequest {

    private String username;
    private String password;
}
