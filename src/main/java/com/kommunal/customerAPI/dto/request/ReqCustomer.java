package com.kommunal.customerAPI.dto.request;


import lombok.Data;

@Data
public class ReqCustomer {

    private Long customerId;
    private String birthdate;

//    @JsonProperty(value = "token")
//    private  ReqToken reqToken;

  }
