package com.kommunal.customerAPI.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;

@Entity
@Table(name = "CC_BUILDINGS")
@Data
@DynamicInsert
@AllArgsConstructor
@NoArgsConstructor
public class CcBuildings {
   @Id
    private Long id;
    private Long compId;
    private String bldName;
    private String address;
    private Long floors;
    private Long entrances;
    private Long flats;
}
