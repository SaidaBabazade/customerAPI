package com.kommunal.customerAPI.service;

import com.kommunal.customerAPI.dto.request.ReqCustomer;
import com.kommunal.customerAPI.dto.response.RespCustomer;
import com.kommunal.customerAPI.dto.response.Response;

import java.util.List;

public interface CustomerService {

    Response<RespCustomer> getCustomerById(ReqCustomer reqCustomer);


}
