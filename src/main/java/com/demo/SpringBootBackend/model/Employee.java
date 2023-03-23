package com.demo.SpringBootBackend.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private  String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email_id")
    private String email;
}
