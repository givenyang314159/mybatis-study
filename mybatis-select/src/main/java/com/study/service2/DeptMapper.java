package com.study.service2;

import com.study.bean.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DeptMapper {
    Department findDeptById(@Param("id") Long id );
    Department findDeptByIdAndEmps(@Param("id") Long id);
    Department findDeptByIdAndEmp2(@Param("id") Long id);
}
