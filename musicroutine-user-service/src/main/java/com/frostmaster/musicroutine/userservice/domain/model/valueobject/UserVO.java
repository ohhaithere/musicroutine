package com.frostmaster.musicroutine.userservice.domain.model.valueobject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserVO {

    private String id;
    private String name;
    private String password;
    private String email;

}
