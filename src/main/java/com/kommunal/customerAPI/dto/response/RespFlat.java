package com.kommunal.customerAPI.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RespFlat {

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
