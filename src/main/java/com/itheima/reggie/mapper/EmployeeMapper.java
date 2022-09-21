package com.itheima.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.reggie.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author yang
 * @Description:
 * @Date 2022/9/21 10:08
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {

}
