package com.kommunal.customerAPI.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RespCustomer {

    private  Long customerId;
    private String firstName;
    private String lastName;
    private String middleName;
    private String birthdate;
    private String telNum;
    private String flatArea;
    private String flatFloor;
    private String flatNum;
    private String garageCode;
    private String carNum;





}
