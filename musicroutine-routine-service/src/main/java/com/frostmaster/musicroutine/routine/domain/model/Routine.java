package com.frostmaster.musicroutine.routine.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Routine {

    @Id
    private UUID id;
    private String name;
    private String text;
    private String level;
    private Integer minutes;

    private String instrument;
    private Date dateCreated;

}
