package com.baizhi.dao;

import com.baizhi.entity.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;
public interface EmpDao{
	public void insert(Emp emp);
	public void delete(Emp emp);
	public void update(Emp emp);
	public List<Emp> queryAll(@Param("dept") String dept);
}
