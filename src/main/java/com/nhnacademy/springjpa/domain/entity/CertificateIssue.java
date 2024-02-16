package com.nhnacademy.springjpa.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "certificate_issue")
@Getter
@Setter
@NoArgsConstructor
public class CertificateIssue {
    @Id
    @Column(name = "certificate_confirmation_number")
    private long certificateConfirmationNumber;

    @ManyToOne
    @JoinColumn(name = "resident_serial_number")
    private Resident resident;

    @Column(name = "certificate_type_code")
    private String certificateTypeCode;

    @Column(name = "certificate_issue_date")
    @Temporal(TemporalType.DATE)
    private Calendar certificateIssueDate;
}
