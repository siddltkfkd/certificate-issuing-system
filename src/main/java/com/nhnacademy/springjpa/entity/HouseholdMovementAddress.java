package com.nhnacademy.springjpa.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;

@Entity
@Table(name = "household_movement_address")
public class HouseholdMovementAddress {
    @EmbeddedId
    private Pk pk;

    private int householdSerialNumber;
    @Temporal(TemporalType.DATE)
    private Calendar houseMovementReportDate;
    @Column(name = "house_movement_address")
    private String houseMovementAddress;
    @Column(name = "last_address_yn")
    private String lastAddressYn;

    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public static class Pk implements Serializable {
        @Column(name = "household_serial_number")
        private int householdSerialNumber;
        @Column(name = "house_movement_report_date")
        private Calendar houseMovementReportDate;
    }
}
