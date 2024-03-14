package com.kommunal.customerAPI.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;

import java.util.Date;

@Entity
@Table(name ="OPERATIONSDONE")
@Data
@DynamicInsert
public class OperationsDone {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private  Long custId;
      private  String name;
      private  String surname;
      private  String  familyName;
      private  Long  bpId;
      private  Long opId;
      private  Long billNum;
      private Date day;
      private  Float amount;
      private String userName;
      private Long status;
      private Date curDate;
      private Long custStatus;
      private  Long blId;






}
