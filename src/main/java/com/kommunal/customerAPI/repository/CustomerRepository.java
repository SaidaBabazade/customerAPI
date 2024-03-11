package com.kommunal.customerAPI.repository;

import com.kommunal.customerAPI.entity.CustData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends JpaRepository<CustData, Long> {
    CustData findCustomerById (Long id);


}
