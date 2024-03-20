package com.kommunal.customerAPI.service;

import com.kommunal.customerAPI.dto.request.ReqContract;
import com.kommunal.customerAPI.dto.response.RespContract;
import com.kommunal.customerAPI.dto.response.Response;

public interface ContractService {
    Response<RespContract> getContractById(Long id);
}
