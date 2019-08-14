package com.sample.repository;

import com.sample.model.entity.EmpVo;
import java.util.List;
import java.util.Map;

public interface EmpRepositoryI<EmpVo> {
  int getEmpCount();

  int getEmpCOunt(int depId);

  List<EmpVo> getEmpList();

  EmpVo getEmpInfo(int empId);

  void updateEmp(EmpVo emp);

  void insertEmp(EmpVo emp);

  void deleteJobHistory(int empId);

  void deleteEmp(int empId, String email);

  List<Map<String, String>> getAllJobId();

  List<Map<String, String>> getAllManagerId();

  List<Map<String, String>> getAllDepId();
}
