package com.example.employeecrud.service;

import com.example.employeecrud.model.Employee;
import com.example.employeecrud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService 
{
    @Autowired
    private EmployeeRepository repository;
    public Employee save(Employee employee) 
    {
        return repository.save(employee);
    }
    public List<Employee> getAll() 
    {
        return repository.findAll();
    }
    public Employee getById(Integer id) 
    {
        return repository.findById(id).orElse(null);
    }
    public void delete(Integer id) 
    {
        repository.deleteById(id);
    }
}
