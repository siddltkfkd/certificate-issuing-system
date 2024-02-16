package com.nhnacademy.springjpa.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "resident")
@NoArgsConstructor
@Getter
@Setter
public class Resident {
    @Id
    @Column(name = "resident_serial_number")
    private int residentSerialNumber;

    private String name;

    @Column(name = "resident_registration_number")
    private String residentRegistrationNumber;

    @Column(name = "gender_code")
    private String genderCode;

    @Column(name = "birth_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar birthDate;

    @Column(name = "birth_place_code")
    private String birthPlaceCode;

    @Column(name = "registration_base_address")
    private String registrationBaseAddress;

    @Column(name = "death_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar deathDate;

    @Column(name = "death_place_code")
    private String deathPlaceCode;

    @Column(name = "death_place_address")
    private String deathPlaceAddress;
}
