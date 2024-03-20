package com.kommunal.customerAPI.dto.response;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class RespGarageContract {
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
