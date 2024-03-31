package com.kommunal.customerAPI.service.impl;

import com.kommunal.customerAPI.dto.request.ReqKomunal;
import com.kommunal.customerAPI.dto.response.RespGarageContract;
import com.kommunal.customerAPI.dto.response.RespKomunal;
import com.kommunal.customerAPI.dto.response.RespStatus;
import com.kommunal.customerAPI.dto.response.Response;
import com.kommunal.customerAPI.entity.GarageContract;
import com.kommunal.customerAPI.entity.Komunal;
import com.kommunal.customerAPI.exception.ExceptionConstants;
import com.kommunal.customerAPI.exception.MyException;
import com.kommunal.customerAPI.repository.KomunalRepository;
import com.kommunal.customerAPI.service.KomunalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class KomunalServiceImpl  implements KomunalService {

    private  final KomunalRepository komunalRepository;




}
