package com.kommunal.customerAPI.repository;

import com.kommunal.customerAPI.entity.GarageContract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GarageContractRepository  extends JpaRepository<GarageContract ,Long> {

    GarageContract findGarageContractById(Long id);
}
