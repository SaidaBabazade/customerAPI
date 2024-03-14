package com.kommunal.customerAPI.repository;

import com.kommunal.customerAPI.entity.CcFlat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlatRepository extends JpaRepository<CcFlat, Long> {

    CcFlat findCcFlatById(Long id);
}
