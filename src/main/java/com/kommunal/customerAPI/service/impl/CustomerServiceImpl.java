package com.kommunal.customerAPI.service.impl;

import com.kommunal.customerAPI.dto.request.ReqCustomer;
import com.kommunal.customerAPI.dto.response.RespCustomer;
import com.kommunal.customerAPI.dto.response.RespStatus;
import com.kommunal.customerAPI.dto.response.Response;
import com.kommunal.customerAPI.entity.CcBuyer;
import com.kommunal.customerAPI.entity.CcFlat;
import com.kommunal.customerAPI.entity.GarageContract;
import com.kommunal.customerAPI.exception.ExceptionConstants;
import com.kommunal.customerAPI.exception.MyException;
import com.kommunal.customerAPI.repository.BuyerRepository;
import com.kommunal.customerAPI.repository.ContractRepository;
import com.kommunal.customerAPI.repository.FlatRepository;
import com.kommunal.customerAPI.repository.GarageContractRepository;
import com.kommunal.customerAPI.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl  implements CustomerService {
    private final BuyerRepository buyerRepository;

    private final FlatRepository flatRepository;

    private final GarageContractRepository garageContractRepository;

    @Override
    public RespCustomer getBuyerByIdAndBirthdate(ReqCustomer reqBuyer) {
        Response<RespCustomer> response = new Response<>();
        RespCustomer respCustomer = null;
        try {
            Long id = reqBuyer.getId();
            Date birthDate = new SimpleDateFormat("dd/MM/yyyy").parse(reqBuyer.getBirthDate());

            if (id == null) {
                throw new MyException(ExceptionConstants.INVALID_REQUEST_DATA, "Invalid request data");
            }
            if (birthDate == null) {
                throw new MyException(ExceptionConstants.INVALID_REQUEST_DATA, "Invalid request data");
            }
            CcBuyer ccBuyer = buyerRepository.findCcBuyerByIdAndBirthDate(id, birthDate);
            CcFlat ccFlat = flatRepository.findCcFlatById(id);
            GarageContract garageContract = garageContractRepository.findGarageContractById(id);
            if (ccBuyer == null) {
                throw new MyException(ExceptionConstants.CC_BUYER_NOT_FOUND, "CcBuyer not found ");
            }
             respCustomer = mapping(ccBuyer, ccFlat,garageContract);
            response.setT(respCustomer);
            response.setStatus(RespStatus.getSuccessMessage());
        } catch (MyException ex) {
            response.setStatus(new RespStatus(ex.getCode(), ex.getMessage()));
            ex.printStackTrace();
        } catch (Exception ex) {
            response.setStatus(new RespStatus(ExceptionConstants.INTERNAL_EXCEPTION, "Internal Exception"));
            ex.printStackTrace();
        }
        return respCustomer;
    }

    private RespCustomer mapping (CcBuyer ccBuyer, CcFlat ccFlat,GarageContract garageContract) {
     RespCustomer respCustomer = RespCustomer.builder().
             id(ccBuyer.getId()).
             firstName(ccBuyer.getFirstName()).
             lastName(ccBuyer.getLastName()).
             birthDate(ccBuyer.getBirthDate()).
             phone(ccBuyer.getPhone()).
             flatNumber(ccFlat.getFlatNumber()).
             compName(ccFlat.getCompName()).
             area(ccFlat.getArea()).
             garageNum(garageContract.getGarageNum()).
             carNo(garageContract.getCarNo()).
             build();
     return  respCustomer;
    }
}