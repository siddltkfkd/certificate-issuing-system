package com.nhnacademy.springjpa.entity;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "resident")
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
    private String registrationBaseAdddress;

    @Column(name = "death_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar deathDate;

    @Column(name = "death_place_code")
    private String deathPlaceCode;

    @Column(name = "death_place_address")
    private String deathPlaceAddress;
}
