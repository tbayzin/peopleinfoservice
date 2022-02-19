package com.charmander.peopleinfoservice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonYedek {

        @Id
        @GeneratedValue
        private Long id;

        private int tckn;
        private String name;
        private String surname;
        private String city;
        private String religion;

        private com.charmander.peopleinfoservice.entity.Person.MarriageStatus status;
        public enum MarriageStatus {
            Married,
            Single,
            Divorced;
        }

    }


