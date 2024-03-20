package com.kommunal.customerAPI.controller;

import com.kommunal.customerAPI.dto.request.ReqContract;
import com.kommunal.customerAPI.dto.response.RespContract;
import com.kommunal.customerAPI.dto.response.Response;
import com.kommunal.customerAPI.service.ContractService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("CC_CONTRACT")
@RequiredArgsConstructor
public class ContractController {

    private  final ContractService contractService;

    @GetMapping("/GetContractById")
    public Response<RespContract> getContractById(@PathVariable Long id){
        return contractService.getContractById(id );
    }

}
