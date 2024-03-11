package com.kommunal.customerAPI.service;

import com.kommunal.customerAPI.dto.response.RespCustomer;
import com.kommunal.customerAPI.dto.response.RespStatus;
import com.kommunal.customerAPI.dto.response.Response;
import com.kommunal.customerAPI.entity.Customer;
import com.kommunal.customerAPI.enums.EnumAvailableStatus;
import com.kommunal.customerAPI.exception.ExceptionConstants;
import com.kommunal.customerAPI.exception.MyException;
import com.kommunal.customerAPI.repository.CustomerRepository;
import jakarta.transaction.SystemException;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements  CustomerService{

     private  final CustomerRepository customerRepository;


    @Override
    public Response<List<RespCustomer>> getCustomerList() {
        Response<List<RespCustomer>> response = new Response<>();
        try{
            List<RespCustomer> respCustomerList = new ArrayList<>();
            List<Customer> customerList = customerRepository.findAllByActive(EnumAvailableStatus.ACTIVE.value);
            if(customerList.isEmpty()) {
                throw new MyException(ExceptionConstants.CUSTOMER_NOT_FOUND,"Customer not found");
            }
            for(Customer customer: customerList){
                RespCustomer respCustomer = new RespCustomer();
                respCustomer.setCustomerId(customer.getId());
                respCustomer.setBirthdate(customer.getBirthdate());
                respCustomer.setCarNum(customer.getCarNum());
                respCustomer.setFirstName(customer.getFirstName());
                respCustomer.setFlatArea(customer.getFlatArea());
                respCustomer.setFlatFloor(customer.getFlatFloor());
                respCustomer.setFlatNum(customer.getFlatNum());
                respCustomer.setGarageCode(customer.getGarageCode());
                respCustomer.setLastName(customer.getLastName());
                respCustomer.setMiddleName(customer.getMiddleName());
                respCustomer.setTelNum(customer.getTelNum());
                respCustomerList.add(respCustomer);
            }
            response.setT(respCustomerList);
            response.setStatus(RespStatus.getSuccessMessage());
        }catch (MyException ex){
         response.setStatus(new RespStatus(1,ex.getMessage()));
        }catch (Exception ex){

        }
        return response;
    }
}
