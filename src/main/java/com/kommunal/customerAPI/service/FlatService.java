package com.kommunal.customerAPI.service;

import com.kommunal.customerAPI.dto.request.ReqFlat;
import com.kommunal.customerAPI.dto.response.RespFlat;
import com.kommunal.customerAPI.dto.response.Response;

public interface FlatService {
    Response <RespFlat> getFlatById(Long id);
}
