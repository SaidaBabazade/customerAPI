package com.kommunal.customerAPI.service.impl;

import com.kommunal.customerAPI.dto.request.ReqFlat;
import com.kommunal.customerAPI.dto.response.RespContract;
import com.kommunal.customerAPI.dto.response.RespFlat;
import com.kommunal.customerAPI.dto.response.RespStatus;
import com.kommunal.customerAPI.dto.response.Response;
import com.kommunal.customerAPI.entity.CcContract;
import com.kommunal.customerAPI.entity.CcFlat;
import com.kommunal.customerAPI.exception.ExceptionConstants;
import com.kommunal.customerAPI.exception.MyException;
import com.kommunal.customerAPI.repository.FlatRepository;
import com.kommunal.customerAPI.service.FlatService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FlatServiceImpl implements FlatService {

    private final FlatRepository flatRepository;
    @Override
    public Response<RespFlat> getFlatById(Long  id) {
        Response<RespFlat> response = new Response<>();
        try {
            if (id == null) {
                throw new MyException(ExceptionConstants.INTERNAL_EXCEPTION, "Invalid request data");
            }
           CcFlat ccFlat  = flatRepository.findCcFlatById(id);
            if (ccFlat== null){
                throw new MyException(ExceptionConstants.CC_FLAT_NOT_FOUND,"CcFlat not found");
            }
            RespFlat respFlat =mapping(ccFlat);
            response.setT(respFlat);
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
    private  RespFlat mapping(CcFlat ccFlat){
        RespFlat respFlat = RespFlat.builder().
              id(ccFlat.getId()).
                bldId(ccFlat.getBldId()).
                flatNumber(ccFlat.getFlatNumber()).
                entrance(ccFlat.getEntrance()).
                fFloor(ccFlat.getFFloor()).
                rooms(ccFlat.getRooms()).
                area(ccFlat.getArea()).
                price1(ccFlat.getPrice1()).
                priceGan(ccFlat.getPriceGan()).
                buyer(ccFlat.getBuyer()).
                userId(ccFlat.getUserId()).
                accId(ccFlat.getAccId()).
                code(ccFlat.getCode()).
                note(ccFlat.getNote()).
                newFlatNum(ccFlat.getNewFlatNum())
                .build();
        return  respFlat;
    }
}
