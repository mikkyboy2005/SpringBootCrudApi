package com.mikkyboy.springbootcrud.springbootcrudapi.dao;

import com.mikkyboy.springbootcrud.springbootcrudapi.model.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> get();

    Employee get(int id);

    void save(Employee employee);

    void delete(int id);
}
