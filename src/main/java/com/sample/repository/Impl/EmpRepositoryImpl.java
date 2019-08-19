package com.sample.repository.Impl;

import com.sample.model.entity.EmpVo;
import com.sample.repository.EmpRepositoryI;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmpRepositoryImpl implements EmpRepositoryI<EmpVo> {

  private JdbcTemplate jdbcTemplate;

  public EmpRepositoryImpl(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  private class EmpMapper implements RowMapper<EmpVo> {

    @Override
    public EmpVo mapRow(ResultSet resultSet, int i) throws SQLException {
      EmpVo emp =
          EmpVo.builder()
              .employeeId(resultSet.getInt("employee_id"))
              .firstName(resultSet.getString("employee_id"))
              .lastName(resultSet.getString("last_name"))
              .email(resultSet.getString("email"))
              .phoneNumber(resultSet.getString("phone_number"))
              .hireDate(resultSet.getDate("hire_date"))
              .jobId(resultSet.getString("job_id"))
              .salary(resultSet.getDouble("salary"))
              .commissionPct(resultSet.getDouble("commission_pct"))
              .managerId(resultSet.getInt("manager_id"))
              .departmentId(resultSet.getInt("department_id"))
              .build();
      return emp;
    }
  }

  @Override
  public int getEmpCount() {
    String sql = "SELECT COUNT(*) FROM employees";
    return jdbcTemplate.queryForObject(sql, Integer.class);
  }

  @Override
  public int getEmpCount(int depId) {
    String sql = "SELECT COUNT(*) FROM EMPLOYEES WHERE department_id=?";
    return jdbcTemplate.queryForObject(sql, Integer.class, depId);
  }

  @Override
  public List getEmpList() {
    String sql = "SELECT * FROM EMPLOYEES";
    return jdbcTemplate.query(sql, new EmpMapper());
  }

  @Override
  public EmpVo getEmpInfo(int empId) {
    String sql =
        "SELECT employee_id,first_name,last_name,email,"
            + "phone_number,hire_date,job_id,salary,commission_pct"
            + ",manager_id,department_id "
            + "FROM employees WHERE employee_id = ?";
    return jdbcTemplate.queryForObject(sql, new EmpMapper(), empId);
  }

  @Override
  public void updateEmp(EmpVo emp) {
    String sql =
        "UPDATE employees set first_name=?,last_name=?,email= ?,"
            + "phone_number=?, hire_date=? , job_id=?, salary=?, commssion_pct=?, manager_id=?,"
            + "department_id=? WHERE employee_id=?";
    jdbcTemplate.update(
        sql,
        emp.getFirstName(),
        emp.getLastName(),
        emp.getEmail(),
        emp.getPhoneNumber(),
        emp.getHireDate(),
        emp.getJobId(),
        emp.getSalary(),
        emp.getCommissionPct(),
        emp.getManagerId(),
        emp.getDepartmentId(),
        emp.getEmployeeId());
  }

  @Override
  public void insertEmp(EmpVo emp) {
    String sql =
        "INSERT INTO employees "
            + "(employee_id,"
            + "first_name,"
            + "last_name,"
            + "email,"
            + "phone_number,"
            + "hire_date,"
            + "job_id,"
            + "salary,"
            + "commission_pct,"
            + "manager_id,"
            + "department_id) "
            + "VALUES(?,?,?,?,?,?,?,?,?,?)";
    jdbcTemplate.update(
        sql,
        emp.getEmployeeId(),
        emp.getFirstName(),
        emp.getLastName(),
        emp.getEmail(),
        emp.getPhoneNumber(),
        emp.getHireDate(),
        emp.getJobId(),
        emp.getSalary(),
        emp.getCommissionPct(),
        emp.getManagerId(),
        emp.getDepartmentId());
  }

  @Override
  public void deleteJobHistory(int empId) {
    String sql = "DELETE FROM job_history WHERE employee_id=?";
    jdbcTemplate.update(sql, empId);
  }

  @Override
  public void deleteEmp(int empId, String email) {
    String sql = "DELETE FORM employees WHERE employee_id = ? AND email = ?";
    jdbcTemplate.update(sql, empId, email);
  }

  @Override
  public List<Map<String, Object>> getAllDepId() {
    String sql =
        "SELECT department_id as departmentId,"
            + " department_name as departmentName"
            + " FROM departments";
    return jdbcTemplate.queryForList(sql);
  }

  @Override
  public List<Map<String, Object>> getAllJobId() {
    String sql = "SELECT job_id AS jobId, job_title AS title FROM jobs";
    return jdbcTemplate.queryForList(sql);
  }

  @Override
  public List<Map<String, Object>> getAllManagerId() {
    String sql = "SELECT job_id as jobId, job_title AS title FROM jobs";
    return jdbcTemplate.queryForList(sql);
  }
}
