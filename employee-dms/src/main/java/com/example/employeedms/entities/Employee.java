package com.example.employeedms.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table()
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column()
    private String firstName;

    @Column()
    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;

    @Column()
    private Number phone;

    @Column()
    private String role;
}
