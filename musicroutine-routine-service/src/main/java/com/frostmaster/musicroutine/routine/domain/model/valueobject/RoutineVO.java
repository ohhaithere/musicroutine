package com.frostmaster.musicroutine.routine.domain.model.valueobject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RoutineVO
{

    private UUID id;
    private String name;
    private String text;
    private String level;
    private Integer minutes;

    private String instrument;
    private Date dateCreated;



}
