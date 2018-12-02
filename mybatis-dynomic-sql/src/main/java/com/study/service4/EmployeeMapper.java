package com.study.service4;

import com.study.bean.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;
@Mapper
public interface EmployeeMapper {

    List<Employee> findBycondition(Employee employee);
    Employee findEmpById(@Param("id") Long id);
}
