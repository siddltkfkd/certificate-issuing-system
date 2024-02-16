package com.nhnacademy.springjpa.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "family_relationship")
public class FamilyRelationship {
    @EmbeddedId
    private Pk pk;

    @MapsId("baseResidentSerialNumber")
    @ManyToOne
    @JoinColumn(name = "base_resident_serial_number")
    private Resident resident;

    private int familyResidentSerialNumber;

    @Column(name = "family_relationship_code")
    private String familyRelationshipCode;

    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public static class Pk implements Serializable{
        @Column(name = "base_resident_serial_number")
        private int baseResidentSerialNumber;
        @Column(name = "family_resident_serial_number")
        private int familyResidentSerialNumber;
    }
}
