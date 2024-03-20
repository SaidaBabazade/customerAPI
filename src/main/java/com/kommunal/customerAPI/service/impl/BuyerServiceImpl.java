//package com.kommunal.customerAPI.service.impl;
//
//import com.kommunal.customerAPI.dto.request.ReqBuyer;
//import com.kommunal.customerAPI.dto.response.RespBuyer;
//import com.kommunal.customerAPI.dto.response.RespContract;
//import com.kommunal.customerAPI.dto.response.RespStatus;
//import com.kommunal.customerAPI.dto.response.Response;
//import com.kommunal.customerAPI.entity.CcBuyer;
//import com.kommunal.customerAPI.entity.CcContract;
//import com.kommunal.customerAPI.exception.ExceptionConstants;
//import com.kommunal.customerAPI.exception.MyException;
//import com.kommunal.customerAPI.repository.BuyerRepository;
//import com.kommunal.customerAPI.service.BuyerService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.time.LocalDate;
//
//@Service
//@RequiredArgsConstructor
//public class BuyerServiceImpl implements BuyerService {
//
//    private final BuyerRepository buyerRepository;
//
//    @Override
//    public Response<RespBuyer> getBuyerById(ReqBuyer reqBuyer) {
//        try {
//            Long id = reqBuyer.getId();
//            LocalDate birthDate = reqBuyer.getBirthDate();
//            if (id == null) {
//                throw new MyException(ExceptionConstants.INVALID_REQUEST_DATA, "Invalid request data");
//            }
//            CcBuyer ccBuyer = buyerRepository.findCcBuyerByIdAndBirthDate(id, birthDate);
//            if(ccBuyer==null){
//                throw  new MyException(ExceptionConstants.CC_BUYER_NOT_FOUND,"CcBuyer not found ");
//            }
//            RespBuyer respBuyer = mapping(ccBuyer);
//
//        }catch (MyException ex) {
//            response.setStatus(new RespStatus(ex.getCode(), ex.getMessage()));
//            ex.printStackTrace();
//        } catch (Exception ex) {
//            response.setStatus(new RespStatus(ExceptionConstants.INTERNAL_EXCEPTION, "Internal Exception"));
//            ex.printStackTrace();
//        }
//        return res ;
//        }
//
//
//    private RespBuyer mapping(CcBuyer ccBuyer){
//        RespBuyer respBuyer = RespBuyer.builder().
//        id(ccBuyer.getId()).
//        firstName(ccBuyer.getFirstName()).
//        lastName(ccBuyer.getLastName()).
//        middleName(ccBuyer.getMiddleName()).
//        passSer(ccBuyer.getPassSer()).
//        passNum(ccBuyer.getPassNum()).
//        passPin(ccBuyer.getPassPin()).
//        passDate(ccBuyer.getPassDate()).
//        passDept(ccBuyer.getPassDept()).
//        gender(ccBuyer.getGender()).
//        birthDate(ccBuyer.getBirthDate()).
//        birthState(ccBuyer.getBirthState()).
//        birthCity(ccBuyer.getBirthCity()).
//        famStatus(ccBuyer.getFamStatus()).
//        state(ccBuyer.getState()).
//        city(ccBuyer.getCity()).
//        address(ccBuyer.getAddress()).
//        workplace(ccBuyer.getWorkplace()).
//        wage(ccBuyer.getWage()).
//        phone(ccBuyer.getPhone()).
//        phoneMob(ccBuyer.getPhoneMob()).
//        email(ccBuyer.getEmail()).
//        regDate(ccBuyer.getRegDate()).
//        userId(ccBuyer.getUserId()).
//        addInfo(ccBuyer.getAddInfo()).
//        idolD(ccBuyer.getIdolD())
//                .build();
//        return  respContract;
//    }
//}