package com.kommunal.customerAPI.controller;

import com.kommunal.customerAPI.dto.request.ReqBuyer;
import com.kommunal.customerAPI.dto.response.RespBuyer;
import com.kommunal.customerAPI.dto.response.Response;
import com.kommunal.customerAPI.service.BuyerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("CC_BUYERS")
@RequiredArgsConstructor
public class BuyerController {
//    private  final BuyerService buyerService;
//
//   @GetMapping("/GetBuyerById")
//    public Response<RespBuyer> getBuyerById(@RequestBody ReqBuyer reqBuyer){
//       return  buyerService.getBuyerById(reqBuyer);
//   }
}
