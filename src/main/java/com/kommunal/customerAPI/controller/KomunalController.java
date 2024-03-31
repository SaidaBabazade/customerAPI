package com.kommunal.customerAPI.controller;

import com.kommunal.customerAPI.dto.request.ReqKomunal;
import com.kommunal.customerAPI.dto.response.RespKomunal;
import com.kommunal.customerAPI.dto.response.Response;
import com.kommunal.customerAPI.service.KomunalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("KOMUNAL")
@RequiredArgsConstructor
public class KomunalController {

    private  final KomunalService komunalService;

    @PostMapping("/AddKomunal")
    public Response addKomunal(@RequestBody ReqKomunal reqKomunal) {
        return komunalService.addKomunal(reqKomunal);
    }

}
