package com.sample.service;

import com.sample.repository.EmpRepositoryI;
import java.util.List;
import java.util.Map;

public interface EmpServiceI<EmpVo>{

  int getEmpCount();

  int getEmpCount(int deptid);

  List<EmpVo> getEmpList();

  EmpVo getEmpINfo(int empid);

  void updateEmp(EmpVo emp);

  void insertEmp(EmpVo emp);

  void deleteEmp(int empid, String email);

  List<Map<String,String>> getAllJobId();

  List<Map<String,String>> getAllManagerId();

  List<Map<String,String>> getAllDeptId();

}
