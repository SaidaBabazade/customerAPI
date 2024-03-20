package com.kommunal.customerAPI.service;

import com.kommunal.customerAPI.dto.response.RespGarageContract;
import com.kommunal.customerAPI.dto.response.Response;

public interface GarageContractService {

    Response<RespGarageContract> getGarageContractById(Long contractId);
}
