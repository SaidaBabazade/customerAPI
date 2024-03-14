package com.kommunal.customerAPI.controller;

import com.kommunal.customerAPI.dto.request.ReqContract;
import com.kommunal.customerAPI.dto.response.Response;
import com.kommunal.customerAPI.service.ContractService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("CC_CONTRACT")
@RequiredArgsConstructor
public class ContractController {

    private  final ContractService contractService;

    @GetMapping("/GetContractById")
    public Response<ReqContract> getContractById(@RequestBody ReqContract reqContract){
        return  contractService.getContractById(reqContract);
    }

}
