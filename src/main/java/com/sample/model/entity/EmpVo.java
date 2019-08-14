package com.sample.model.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class EmpVo {
  private int employeeId;
  private String firstName;
  private String lastName;
  private String email;
  private  String phoneNumber;
  private Date hireDate;
  private String jobId;
  private double salary;
  private double commissionPct;
  private int managerId;
  private int departmentId;

  @Builder
  public EmpVo(int employeeId, String firstName, String lastName, String email,
      String phoneNumber, Date hireDate, String jobId, double salary, double commissionPct,
      int managerId, int departmentId) {
    this.employeeId = employeeId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.hireDate = hireDate;
    this.jobId = jobId;
    this.salary = salary;
    this.commissionPct = commissionPct;
    this.managerId = managerId;
    this.departmentId = departmentId;
  }
}
