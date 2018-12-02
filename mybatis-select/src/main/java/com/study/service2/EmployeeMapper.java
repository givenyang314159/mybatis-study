package com.study.service2;

import com.study.bean.Employee;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Mapper
public interface EmployeeMapper {

    List<Employee> findAll();
    @MapKey("id")
    Map<Long,Employee> getByName(@Param("name") String name);

    List<Employee> findallbyResutMap();

    Employee findEmpAndDept(@Param("id") Long id );
    Employee findEmpAndDeptByStep(@Param("id") Long id);
    Employee findEmpByDepid(@Param("depid") Long depid);


}
