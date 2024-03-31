package com.kommunal.customerAPI.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;

@Entity
@Table(name = "CC_FLAT")
@Data
@DynamicInsert
@AllArgsConstructor
@NoArgsConstructor
public class CcFlat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long bldId;
    private String flatNumber;
    private String entrance;
    private String compName;
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
