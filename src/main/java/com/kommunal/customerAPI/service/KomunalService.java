package com.kommunal.customerAPI.service;

import com.kommunal.customerAPI.dto.request.ReqKomunal;
import com.kommunal.customerAPI.dto.response.RespKomunal;
import com.kommunal.customerAPI.dto.response.Response;

public interface KomunalService {

    Response addKomunal(ReqKomunal reqKomunal);

}
