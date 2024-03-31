package com.kommunal.customerAPI.dto.response;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class RespCustomer {

    private Long id;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String phone;
    private String flatNumber;
    private String compName;
    private Long area;
    private String garageNum;
    private  String carNo;

}
