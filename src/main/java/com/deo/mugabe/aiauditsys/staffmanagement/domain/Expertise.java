package com.deo.mugabe.aiauditsys.staffmanagement.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Expertise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(nullable = false)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(nullable = false)
    private Staff staff;

    @ManyToOne(optional = false)
    @JoinColumn(nullable = false)
    private Skill skill;

    @Column(nullable = false)
    private int level;

}
