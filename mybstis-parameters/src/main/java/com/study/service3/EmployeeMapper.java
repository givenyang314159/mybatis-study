package com.study.service;

import com.study.bean.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Mapper
public interface EmployeeMapper {
    Employee findOne(Long id);
    List<Employee> findAll();
    boolean add(Employee employee);
    boolean delete(Long id);
    boolean update(Employee employee);


    Employee getEmpByIdAndName(Long id, String lastName);
    Employee getEmpByIdAndName2(@Param("id") Long id, @Param("name") String lastName);
    Employee getEmpByIdAndName3(Employee employee);
    Employee getEmpByMap(Map<String,Object> map);
    //Employee getEmpByIdAndName4(Employee employee);
    Employee getEmpByIdAndName4(@Param("table") String table,@Param("emp") Employee employee);

}
