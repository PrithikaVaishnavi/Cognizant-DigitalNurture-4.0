package com.example.employeecrud.controller;

import com.example.employeecrud.model.Employee;
import com.example.employeecrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController 
{
    @Autowired
    private EmployeeService service;

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) 
    {
        return service.save(employee);
    }

    @GetMapping
    public List<Employee> getAllEmployees() 
    {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Integer id) 
    {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Integer id) {
        service.delete(id);
    }
}
