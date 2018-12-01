package com.study;

import com.study.service.EmployeeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StartUpMybatisHelloTest {
    @Autowired
    EmployeeMapper employeeMapper;
    @Test
    public void testget()
    {
        System.out.println(employeeMapper.findOne(Long.valueOf(1)));
    }

}
