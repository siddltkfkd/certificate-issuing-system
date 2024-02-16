package com.nhnacademy.springjpa.domain.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;

@Entity
@Table(name = "household_composition_resident")
@Getter
@Setter
@NoArgsConstructor
public class HouseholdCompositionResident {
    @EmbeddedId
    private Pk pk;

    @MapsId("householdSerialNumber")
    @ManyToOne
    @JoinColumn(name = "household_serial_number")
    private Household household;

    @MapsId("residentSerialNumber")
    @ManyToOne
    @JoinColumn(name = "resident_serial_number")
    private Resident resident;

    @Column(name = "report_date")
    @Temporal(TemporalType.DATE)
    private Calendar reportDate;

    @Column(name = "household_relationship_code")
    private String householdRelationshipCode;

    @Column(name = "household_composition_change_reason_code")
    private String householdCompositionChangeReasonCode;

    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    @Getter
    @Setter
    public static class Pk implements Serializable {
        private int householdSerialNumber;
        private int residentSerialNumber;
    }
}
