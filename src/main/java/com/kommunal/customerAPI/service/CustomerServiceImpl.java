package com.kommunal.customerAPI.service;

import com.kommunal.customerAPI.dto.request.ReqCustomer;
import com.kommunal.customerAPI.dto.response.RespCustomer;
import com.kommunal.customerAPI.dto.response.RespStatus;
import com.kommunal.customerAPI.dto.response.Response;
import com.kommunal.customerAPI.entity.CustData;
import com.kommunal.customerAPI.exception.ExceptionConstants;
import com.kommunal.customerAPI.exception.MyException;
import com.kommunal.customerAPI.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements  CustomerService{

     private  final CustomerRepository customerRepository;

    @Override
    public Response<RespCustomer> getCustomerById(ReqCustomer reqCustomer) {
        Response<RespCustomer> response = new Response<>();
        try {
            Long customerId = reqCustomer.getCustomerId();
//            utility.checkToken(reqCustomer.getReqToken());
            if (customerId == null) {
                throw new MyException(ExceptionConstants.INVALID_REQUEST_DATA, "Invalid request data");
            }
            CustData customer = customerRepository.findCustomerById(customerId);
            if (customer == null) {
                throw new MyException(ExceptionConstants.CUSTOMER_NOT_FOUND, "Customer not found");
            }
            RespCustomer respCustomer = mapping(customer);
            response.setT(respCustomer);
            response.setStatus(RespStatus.getSuccessMessage());
        } catch (MyException ex) {
            response.setStatus(new RespStatus(ex.getCode(), ex.getMessage()));
            ex.printStackTrace();
        } catch (Exception ex) {
            response.setStatus(new RespStatus(ExceptionConstants.INTERNAL_EXCEPTION, "Internal Exception"));
            ex.printStackTrace();
        }
        return response;
    }

    private RespCustomer mapping( CustData customer) {
        RespCustomer respCustomer = RespCustomer.builder().
                customerId(customer.getId()).
                birthdate(customer.getBirthdate()).
                carNum(customer.getCarNum()).
                firstName(customer.getFirstName()).
                flatArea(customer.getFlatArea()).
                flatFloor(customer.getFlatFloor()).
                flatNum(customer.getFlatNum()).
                garageCode(customer.getGarageCode()).
                lastName(customer.getLastName()).
                middleName(customer.getMiddleName()).
                telNum(customer.getTelNum()).
                build();
        return respCustomer;
    }

}