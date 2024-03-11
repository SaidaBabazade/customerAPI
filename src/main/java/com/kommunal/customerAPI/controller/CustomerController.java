package com.kommunal.customerAPI.controller;

import com.kommunal.customerAPI.dto.response.RespCustomer;
import com.kommunal.customerAPI.dto.response.Response;
import com.kommunal.customerAPI.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/CUST_DATA")
@RequiredArgsConstructor
public class CustomerController {

    private  final CustomerService customerService;


    @RequestMapping(value ="/getCustomerList")
    public Response<List<RespCustomer>>  getCustomerList(){
    return customerService.getCustomerList();
    }
}