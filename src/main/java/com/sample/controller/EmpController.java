package com.sample.controller;

import com.sample.service.EmpServiceI;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@RequestMapping("/")
public class EmpController{

  private EmpServiceI empService;

  public EmpController(EmpServiceI empService) {
    this.empService = empService;
  }

  @RequestMapping(value = "/hr/count",method = RequestMethod.GET)
  public String empCount(@RequestParam(value = "deptid",required = false,defaultValue = "0") int deptid, Model model){
    if (deptid ==0){
      model.addAttribute("count",empService.getEmpCount());
    }else {
      model.addAttribute("count",empService.getEmpCount());
    }
    return "hr/count";
  }



}

