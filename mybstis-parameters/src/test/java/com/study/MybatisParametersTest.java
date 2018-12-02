package com.study;

import com.study.bean.Employee;
import com.study.service3.EmployeeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MybatisParametersTest {
    @Autowired
    EmployeeMapper employeeMapper;
    @Test
    public void getAll()
    {
        System.out.println(employeeMapper.findAll());
    }
    @Test
    public void getEmpbyIDandName() {
        System.out.println(employeeMapper.getEmpByIdAndName(Long.valueOf(1),"tomupdate2"));
    }
    @Test
    public void getEmpbyIDandName1() {
        System.out.println(employeeMapper.getEmpByIdAndName2(Long.valueOf(1),"tomupdate2"));
    }
    @Test
    public void getEmpbyIDandName2() {
        Employee employee=new Employee();
        employee.setId(Long.valueOf(1)).setLastName("tomupdate2");
        System.out.println(employeeMapper.getEmpByIdAndName3(employee));
    }
    @Test
    public void getEmpbyIDandName3() {
        Map<String,Object> map= new HashMap<>();
        map.put("id",Long.valueOf(1));
        map.put("lastName","tomupdate2");
        System.out.println(employeeMapper.getEmpByMap(map));
    }

    @Test
    public void getEmpByIDAndName4() {
        Employee employee=new Employee();
        employee.setId(Long.valueOf(1)).setLastName("tomupdate2");
        System.out.println(employeeMapper.getEmpByIdAndName4("t_employee",employee));
    }

}
