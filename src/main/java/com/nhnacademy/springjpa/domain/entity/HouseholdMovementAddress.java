package com.nhnacademy.springjpa.domain.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;

@Entity
@Table(name = "household_movement_address")
@Getter
@Setter
@NoArgsConstructor
public class HouseholdMovementAddress {
    @EmbeddedId
    private Pk pk;

    @OneToOne
    @MapsId("householdSerialNumber")
    @JoinColumn(name = "household_serial_number")
    private Household household;

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
    @Getter
    @Setter
    public static class Pk implements Serializable {
        private int householdSerialNumber;
        @Column(name = "house_movement_report_date")
        private Calendar houseMovementReportDate;
    }
}
