package com.kommunal.customerAPI.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;

import java.time.LocalDate;

@Entity
@Table(name = "GARAGECONTRACTS")
@Data
@DynamicInsert
public class GarageContract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long contractId;
    private Long custId;
    private String garageNum;
    private LocalDate startDate;
    private Long status;
    private String username;
    private String fromDate;
    private String endDate;
    private  String carNo;
    private String cmpN;

}
