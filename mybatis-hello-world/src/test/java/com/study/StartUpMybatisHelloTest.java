package com.study;

import com.study.bean.Employee;
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
    public void get()
    {
        Employee employee =employeeMapper.findOne(Long.valueOf(2));
        if(null!=employee)
        System.out.println(employee.toString());
        else
            System.out.println("============No Employee============");
    }
    @Test
    public void getAll()
    {
        System.out.println(employeeMapper.findAll());
    }
    @Test
    public void add()
    {
        Employee employee= new Employee();
        employee.setLastName("杨畔").setGender("男").setEmail("yp@fm.com");
        System.out.println(employeeMapper.add(employee));
    }
    @Test
    public void delete()
    {
        long id =2;
        if (employeeMapper.delete(Long.valueOf(id)))
            System.out.println("删除 id 为:"+id+"的Employee");
        else
            System.out.println("查无此员工");
    }

    @Test
    public void update()
    {
        long id =5;
        Employee employee =new Employee();
        employee.setId(id).setLastName("张三").setEmail("zhangsan@fm.com").setGender("女");
        if (employeeMapper.update(employee))
            System.out.println("更新成功");
        else
            System.out.println("更新失败");

    }
}
