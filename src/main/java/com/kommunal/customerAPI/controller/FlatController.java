package com.kommunal.customerAPI.controller;

import com.kommunal.customerAPI.dto.request.ReqFlat;
import com.kommunal.customerAPI.dto.response.RespFlat;
import com.kommunal.customerAPI.dto.response.Response;
import com.kommunal.customerAPI.service.FlatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("CC_FLATS")
@RequiredArgsConstructor
public class FlatController {

    private  final FlatService flatService;

    @GetMapping("/GetFlatById")
    public Response<RespFlat> getFlatById(@PathVariable Long id){

        return  flatService.getFlatById(id);
    }

}
