package com.frostmaster.musicroutine.userservice.domain.model.valueobject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegisterUserVO {

    private String name;
    private String password;
    private String email;

}
