package com.kommunal.customerAPI.controller;

import com.kommunal.customerAPI.dto.request.ReqCustomer;
import com.kommunal.customerAPI.dto.request.ReqKomunal;
import com.kommunal.customerAPI.dto.response.RespCustomer;
import com.kommunal.customerAPI.dto.response.RespKomunal;
import com.kommunal.customerAPI.dto.response.Response;
import com.kommunal.customerAPI.service.KomunalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("KOMUNAL")
@RequiredArgsConstructor
public class KomunalController {

    private final KomunalService komunalService;

    @GetMapping("/GetKomunalById")
    public RespKomunal getKomunalById(@RequestBody ReqKomunal reqKomunal) {
        return komunalService.getKomunalById(reqKomunal);
    }
}
