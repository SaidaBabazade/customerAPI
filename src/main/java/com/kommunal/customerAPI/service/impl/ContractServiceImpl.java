package com.kommunal.customerAPI.service.impl;

import com.kommunal.customerAPI.dto.request.ReqContract;
import com.kommunal.customerAPI.dto.response.RespContract;
import com.kommunal.customerAPI.dto.response.RespStatus;
import com.kommunal.customerAPI.dto.response.Response;
import com.kommunal.customerAPI.entity.CcContract;
import com.kommunal.customerAPI.exception.ExceptionConstants;
import com.kommunal.customerAPI.exception.MyException;
import com.kommunal.customerAPI.repository.ContractRepository;
import com.kommunal.customerAPI.service.ContractService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class ContractServiceImpl implements ContractService {

    private  final ContractRepository contractRepository;

    @Override
    public Response<RespContract> getContractById(ReqContract reqContract) {
        Response<RespContract> response = new Response<>();
        try {
            Long id =reqContract.getId();
            if(id == null){
                throw  new MyException(ExceptionConstants.INVALID_REQUEST_DATA,"Invalid request data");
            }
            CcContract ccContract = contractRepository.findCcContractById(id);
            if (ccContract == null){
                throw new MyException(ExceptionConstants.CC_CONTRACT_NOT_FOUND,"CcContract not found");
            }
            RespContract respContract =mapping(ccContract);
            response.setT(respContract);
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

    private  RespContract mapping(CcContract ccContract){
        RespContract respContract = RespContract.builder().
                id(ccContract.getId()).
                contNum(ccContract.getContNum()).
                buyer(ccContract.getBuyer()).
                accId(ccContract.getAccId()).
                branchId(ccContract.getBranchId()).
                flatId(ccContract.getFlatId()).
                contCur(ccContract.getContCur()).
                contAmount(ccContract.getContAmount()).
                openDate(ccContract.getOpenDate()).
                closeDate(ccContract.getCloseDate()).
                interestRate(ccContract.getInterestRate()).
                initialAmount(ccContract.getInitialAmount()).
                userId(ccContract.getUserId()).
                dueInterestRate(ccContract.getDueInterestRate()).
                squareMeterAmount(ccContract.getSquareMeterAmount()).
                rest(ccContract.getRest()).
                note(ccContract.getNote()).
                rest2(ccContract.getRest2()).
                sq(ccContract.getSq()).
                monthPay(ccContract.getMonthPay()).
                priceCred(ccContract.getPriceCred()).
                status(ccContract.getStatus()).
                keyPostDate(ccContract.getKeyPostDate())
                .build();
        return  respContract;
    }
}
