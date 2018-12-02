package com.study;

import com.study.bean.Employee;
import com.study.service4.EmployeeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MybatisDynamicSqlTest {
    @Autowired
    EmployeeMapper employeeMapper;
    @Test
    public void findBycondition() {
        Employee employee =new Employee();
        employee.setLastName("tom");
        System.out.println(employeeMapper.findBycondition(employee));
    }

}
