package com.charmander.peopleinfoservice.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder


@Table
public class People {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String surname;
    private String city;

}
