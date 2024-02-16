package com.nhnacademy.springjpa.entity;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "household")
public class Household {
    @Id
    @Column(name = "household_serial_number")
    private int householdSerialNumber;
    @Column(name = "household_resident_serial_number")
    private int householdResidentSerialNumber;
    @Column(name = "household_composition_date")
    @Temporal(TemporalType.DATE)
    private Calendar householdCompositionDate;
    @Column(name = "household_composition_reason_code")
    private String householdCompositionReasonCode;
    @Column(name = "current_house_movement_address")
    private String currentHouseMovementAddress;
}
