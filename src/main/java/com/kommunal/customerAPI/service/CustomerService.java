package com.kommunal.customerAPI.service;

import com.kommunal.customerAPI.dto.request.ReqCustomer;
import com.kommunal.customerAPI.dto.response.RespCustomer;
public interface CustomerService {


    RespCustomer getBuyerByIdAndBirthdate(ReqCustomer reqBuyer);

}

