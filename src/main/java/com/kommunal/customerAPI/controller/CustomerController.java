package com.kommunal.customerAPI.controller;

import com.kommunal.customerAPI.dto.request.ReqCustomer;
import com.kommunal.customerAPI.dto.response.RespCustomer;
import com.kommunal.customerAPI.dto.response.Response;
import com.kommunal.customerAPI.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/CUST_DATA")
@RequiredArgsConstructor
public class CustomerController {

    private  final CustomerService customerService;

    @GetMapping("/GetCustomerById")
    public Response<RespCustomer> getCustomerById(@RequestBody ReqCustomer reqCustomer) {
        return customerService.getCustomerById(reqCustomer);
    }




}
