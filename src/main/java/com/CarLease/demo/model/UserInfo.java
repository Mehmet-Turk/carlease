package com.CarLease.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class UserInfo {
    @Id
    private int id;
    private String username;
    private String password;
}