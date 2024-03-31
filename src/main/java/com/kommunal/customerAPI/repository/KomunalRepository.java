package com.kommunal.customerAPI.repository;

import com.kommunal.customerAPI.entity.Komunal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KomunalRepository extends JpaRepository<Komunal,Long> {

    Komunal findKomunalById(Long id);
}
