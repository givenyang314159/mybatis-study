package com.study;

import com.study.bean.Employee;
import com.study.service.DeptMapper;
import com.study.service.EmployeeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisSelectTest {
    @Autowired
    EmployeeMapper employeeMapper;

    @Test
    public void getAll() {
        System.out.println(employeeMapper.findAll());
    }

    @Test
    public void getEmpTest() {
        System.out.println(employeeMapper.getByName("giv"));
    }

    @Test
    public void getEmpByResutlMap() {

        System.out.println(employeeMapper.findallbyResutMap());
    }

    @Test
    public void getEmpandDept() {
        System.out.println(employeeMapper.findEmpAndDept(Long.valueOf(1)));

    }

    @Test
    public void getEmpandDeptByStep() {
        System.out.println(employeeMapper.findEmpAndDeptByStep(Long.valueOf(5)).getDept().getName());

    }

    @Autowired
    DeptMapper deptMapper;

    @Test
    public void testGetDept() {
        System.out.println(deptMapper.findDeptByIdAndEmps(Long.valueOf(1)));
    }
    @Test
    public void testGetDept2(){
        System.out.println(deptMapper.findDeptByIdAndEmp2(Long.valueOf(1)).getEmps());
    }
}
