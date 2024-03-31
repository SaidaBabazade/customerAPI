package com.kommunal.customerAPI.dto.response;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
@Data
@Builder
public class RespKomunal {
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
