package com.kommunal.customerAPI.controller;

import com.kommunal.customerAPI.dto.response.RespGarageContract;
import com.kommunal.customerAPI.dto.response.Response;
import com.kommunal.customerAPI.service.GarageContractService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("GARAGECONTRACTS")
@RequiredArgsConstructor
public class GarageContractController {

    private  final GarageContractService garageContractService;
    @GetMapping()
    public Response<RespGarageContract> getGarageContractById(@PathVariable Long contractId){
        return garageContractService.getGarageContractById(contractId);
    }
}
