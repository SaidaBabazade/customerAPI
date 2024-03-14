package com.kommunal.customerAPI.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;

@Entity
@Table(name = "CC_FLAT")
@Data
@DynamicInsert
public class CcFlat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long bldId;
    private String flatNumber;
    private String entrance;
    private String fFloor;
    private Long rooms;
    private Long area;
    private Long price1;
    private Long priceGan;
    private Long buyer;
    private Long userId;
    private Long accId;
    private String code;
    private Long note;
    private String newFlatNum;




}
