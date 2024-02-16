package com.nhnacademy.springjpa.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;

// 출생 사망 신고 주민
@Entity
@Table(name = "birth_death_report_resident")
public class BirthDeathReportResident {
    @EmbeddedId
    private Pk pk;

    @MapsId("residentSerialNumber")
    @ManyToOne
    @JoinColumn(name = "resident_serial_number")
    private Resident resident;

    private String birthDeathTypeCode;

    private int reportResidentSerialNumber;

    @Column(name = "birth_death_report_date")
    @Temporal(TemporalType.DATE)
    private Calendar birthDeathReportDate;

    @Column(name = "birth_report_qualifications_code")
    private String birthReportQualificationsCode;

    @Column(name = "death_report_qualifications_code")
    private String deathReportQualificationsCode;

    @Column(name = "email_address")
    private String emailAddress;

    @Column(name = "phoneNumber")
    private String phone_number;

    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public static class Pk implements Serializable {
        @Column(name = "resident_serial_number")
        private int residentSerialNumber;
        @Column(name = "birth_death_type_code")
        private String birthDeathTypeCode;
        @Column(name = "report_resident_serial_number")
        private int reportResidentSerialNumber;
    }
}
