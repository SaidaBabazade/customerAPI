package com.kommunal.customerAPI.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "CC_BUYERS")
@Data
@DynamicInsert
@AllArgsConstructor
@NoArgsConstructor
public class CcBuyer {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String middleName;
    private String passSer;
    private String passNum;
    private String passPin;
    private Date passDate;
    private String passDept;
    private Boolean gender;
    private Date birthDate;
    private Short birthState;
    private Short birthCity;
    private Boolean famStatus;
    private Short state;
    private Short city;
    private String address;
    private String workplace;
    private Long wage;
    private String phone;
    private String phoneMob;
    private String email;
    private Date regDate;
    private Long userId;
    private String addInfo;
    private Long idolD;

}
