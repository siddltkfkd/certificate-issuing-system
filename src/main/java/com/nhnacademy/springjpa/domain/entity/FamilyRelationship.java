package com.nhnacademy.springjpa.domain.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "family_relationship")
@Getter
@Setter
@NoArgsConstructor
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
    @Getter
    @Setter
    public static class Pk implements Serializable{
        private int baseResidentSerialNumber;
        @Column(name = "family_resident_serial_number")
        private int familyResidentSerialNumber;
    }
}
