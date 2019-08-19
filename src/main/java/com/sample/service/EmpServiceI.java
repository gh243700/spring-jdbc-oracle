package com.sample.service;

import com.sample.repository.EmpRepositoryI;
import java.util.List;
import java.util.Map;

public interface EmpServiceI<EmpVo>{

  int getEmpCount();

  int getEmpCount(int deptid);

  List<EmpVo> getEmpList();

  EmpVo getEmpInfo(int empid);

  void updateEmp(EmpVo emp);

  void insertEmp(EmpVo emp);

  void deleteEmp(int empid, String email);

  List<Map<String,Object>> getAllJobId();

  List<Map<String,Object>> getAllManagerId();

  List<Map<String,Object>> getAllDeptId();

}
