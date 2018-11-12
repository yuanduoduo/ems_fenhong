package com.baizhi.service;

import com.baizhi.entity.Emp;

import java.util.List;

public interface EmpService {
	public void insert(Emp emp);
	public void delete(Emp emp);
	public void update(Emp emp);
	public List<Emp> queryAll(String dept);
}
