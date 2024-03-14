package com.kommunal.customerAPI.dto.response;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
public class RespContract {
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
