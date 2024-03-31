package com.kommunal.customerAPI.controller;

import com.kommunal.customerAPI.dto.request.ReqCustomer;
import com.kommunal.customerAPI.dto.response.*;
import com.kommunal.customerAPI.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class CustomerController {

    private  final CustomerService customerService;
    @GetMapping("/GetBuyerById")
    public RespCustomer getBuyerById(@RequestBody ReqCustomer reqBuyer){
        return  customerService.getBuyerByIdAndBirthdate(reqBuyer);
    }

}
