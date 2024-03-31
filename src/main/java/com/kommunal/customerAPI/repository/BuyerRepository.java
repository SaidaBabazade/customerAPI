package com.kommunal.customerAPI.repository;

import com.kommunal.customerAPI.entity.CcBuyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Date;

@Repository
public interface BuyerRepository  extends JpaRepository<CcBuyer,Long> {
    CcBuyer findCcBuyerByIdAndBirthDate(Long id, Date date);

}
