package com.kommunal.customerAPI.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;

import java.time.LocalDate;

@Entity
@Table(name = "KOMUNAL")
@Data
@DynamicInsert
public class Komunal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long custId;
    private Long billNo;
    private LocalDate billDate;
    private Long il;
    private Long ay;
    private Float tarif;
    private Float amount;
    private LocalDate curDate;
    private String flatStatus;
    private String name;
    private String surname;
}
