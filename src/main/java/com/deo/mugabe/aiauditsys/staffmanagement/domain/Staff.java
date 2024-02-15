package com.deo.mugabe.aiauditsys.staffmanagement.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private String  firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String email;

    @ManyToOne(optional = false)
    @JoinColumn(name = "job_title_id", nullable = false)
    private JobTitle jobTitle;


}
