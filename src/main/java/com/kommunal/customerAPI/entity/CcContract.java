package com.kommunal.customerAPI.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name ="CC_CONTRACT")
@Data
@DynamicInsert

public class CcContract {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     private String contNum;
     private Long buyer;
     private Long accId;
     private Long branchId;
     private Long flatId;
     private Long contCur;
     private Long contAmount;
     private LocalDate openDate;
     private LocalDate closeDate;
     private Long interestRate;
     private Long initialAmount;
     private Long userId;
     private BigDecimal dueInterestRate;
     private BigDecimal squareMeterAmount;
     private BigDecimal rest;
     private Long note;
     private BigDecimal rest2;
     private BigDecimal sq;
     private BigDecimal  monthPay;
     private BigDecimal priceCred;
     private Long status;
     private LocalDate keyPostDate;

}
