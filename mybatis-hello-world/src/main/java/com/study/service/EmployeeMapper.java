package com.study.service;

import com.study.bean.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Mapper
public interface EmployeeMapper {
    Employee findOne(Long id);
    List<Employee> findAll();
    boolean add(Employee employee);
    boolean delete(Long id);
    boolean update (Employee employee);
}
