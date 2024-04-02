package com.kommunal.customerAPI.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;

@Entity
@Table(name = "CC_COMPANIES")
@Data
@DynamicInsert
@AllArgsConstructor
@NoArgsConstructor
public class CcCompanies {
    @Id
    private  Long id;
    private  String compName;
}
