package com.kommunal.customerAPI.service.impl;

import com.kommunal.customerAPI.dto.response.RespGarageContract;
import com.kommunal.customerAPI.dto.response.RespStatus;
import com.kommunal.customerAPI.dto.response.Response;
import com.kommunal.customerAPI.entity.GarageContract;
import com.kommunal.customerAPI.exception.ExceptionConstants;
import com.kommunal.customerAPI.exception.MyException;
import com.kommunal.customerAPI.repository.GarageContractRepository;
import com.kommunal.customerAPI.service.GarageContractService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GarageContractServiceImpl implements GarageContractService {

    private  final GarageContractRepository garageContractRepository;
    @Override
    public Response<RespGarageContract> getGarageContractById(Long contractId) {
        Response<RespGarageContract> response = new Response<>();
        try {
            if (contractId == null){
                 throw new MyException(ExceptionConstants.INVALID_REQUEST_DATA,"Invalid request data");
            }
            GarageContract garageContract =garageContractRepository.findGarageContractById(contractId);
            if(garageContract == null){
                throw  new MyException(ExceptionConstants.GARAGE_CONTRACT_NOT_FOUND,"GarageContract not found");
            }
            RespGarageContract respGarageContract=mapping(garageContract);
            response.setT(respGarageContract);
            response.setStatus(RespStatus.getSuccessMessage());
        }catch (MyException ex) {
            response.setStatus(new RespStatus(ex.getCode(), ex.getMessage()));
            ex.printStackTrace();
        } catch (Exception ex) {
            response.setStatus(new RespStatus(ExceptionConstants.INTERNAL_EXCEPTION, "Internal Exception"));
            ex.printStackTrace();
        }
        return response;
    }
     private  RespGarageContract mapping(GarageContract garageContract){
        RespGarageContract respGarageContract = RespGarageContract.builder().
                contractId(garageContract.getContractId()).
                custId(garageContract.getCustId()).
                garageNum(garageContract.getGarageNum()).
                startDate(garageContract.getStartDate()).
                status(garageContract.getStatus()).
                username(garageContract.getUsername()).
                fromDate(garageContract.getFromDate()).
                endDate(garageContract.getEndDate()).
                carNo(garageContract.getCarNo()).
                cmpN(garageContract.getCmpN()).
                build();
        return  respGarageContract;
     }
}
