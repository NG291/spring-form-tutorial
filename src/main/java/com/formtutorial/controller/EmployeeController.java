package com.formtutorial.controller;

import com.formtutorial.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class EmployeeController {
    @GetMapping("/showForm")
    public String showForm(ModelMap model){
        model.addAttribute("employee", new Employee());
        return "/create";
    }
    @PostMapping("/addEmployee")
    public String submit(@ModelAttribute("employee") Employee employee, ModelMap model){
      model.addAttribute("name", employee.getName());
      model.addAttribute("contactNumber",employee.getContactNumber());
      model.addAttribute("id",employee.getId());
      return "/info";
    }
}