package com.nhnacademy.springjpa.entity;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "certificate_issue")
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
