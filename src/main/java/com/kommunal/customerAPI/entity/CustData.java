package com.kommunal.customerAPI.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;

@Entity
@Table(name ="CUST_DATA")
@Data
@DynamicInsert
public class CustData {
    @Id
    private Long id;
    private String birthdate;
    private String carNum;
    private String firstName;
    private String flatArea;
    private String flatFloor;
    private String flatNum;
    private String garageCode;
    private String lastName;
    private String middleName;
    private String telNum;


}
