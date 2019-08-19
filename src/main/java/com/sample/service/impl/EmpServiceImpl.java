package com.sample.service.impl;

import com.sample.model.entity.EmpVo;
import com.sample.repository.EmpRepositoryI;
import com.sample.service.EmpServiceI;
import java.util.List;
import java.util.Map;

public class EmpServiceImpl implements EmpServiceI<EmpVo> {

  private EmpRepositoryI empRepositoryI;

  public EmpServiceImpl(EmpRepositoryI empRepositoryI) {
    this.empRepositoryI = empRepositoryI;
  }

  @Override
  public int getEmpCount() {
    return empRepositoryI.getEmpCount();
  }

  @Override
  public int getEmpCount(int deptid) {
    return empRepositoryI.getEmpCount(deptid);
  }

  @Override
  public List getEmpList() {
    return empRepositoryI.getEmpList();
  }

  @Override
  public EmpVo getEmpInfo(int empid) {
    return (EmpVo) empRepositoryI.getEmpInfo(empid);
  }

  @Override
  public void updateEmp(EmpVo emp) {
    empRepositoryI.updateEmp(emp);
  }

  @Override
  public void insertEmp(EmpVo emp) {
    empRepositoryI.insertEmp(emp);
  }

  @Override
  public void deleteEmp(int empid, String email) {
    empRepositoryI.deleteEmp(empid,email);
  }

  @Override
  public List<Map<String, Object>> getAllJobId() {
    return empRepositoryI.getAllJobId();
  }

  @Override
  public List<Map<String, Object>> getAllManagerId() {
    return empRepositoryI.getAllManagerId();
  }

  @Override
  public List<Map<String, Object>> getAllDeptId() {
    return empRepositoryI.getAllDepId();
  }
}
