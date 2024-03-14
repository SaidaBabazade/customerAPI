package com.kommunal.customerAPI.controller;

import com.kommunal.customerAPI.dto.request.ReqFlat;
import com.kommunal.customerAPI.dto.response.RespFlat;
import com.kommunal.customerAPI.dto.response.Response;
import com.kommunal.customerAPI.service.FlatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("CC_FLATS")
@RequiredArgsConstructor
public class FlatController {

    private  final FlatService flatService;

    @GetMapping("/GetFlatById")
    public Response<RespFlat> getFlatById(@RequestBody ReqFlat reqFlat){

        return  flatService.getFlatById(reqFlat);
    }

}
