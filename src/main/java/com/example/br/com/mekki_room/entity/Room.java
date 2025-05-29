package com.example.br.com.mekki_room.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "room")
@Data
@ToString
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer capacity;

    private String name;

    private String code;

    private String description;

    @Column(name = "maintenance_reason")
    private String maintenanceReason;

    @Column(name = "is_Available")
    private Boolean isAvailable;

}