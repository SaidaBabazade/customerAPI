package com.kommunal.customerAPI.repository;

import com.kommunal.customerAPI.entity.CcContract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractRepository extends JpaRepository<CcContract,Long> {
    CcContract findCcContractById(Long id);
}
