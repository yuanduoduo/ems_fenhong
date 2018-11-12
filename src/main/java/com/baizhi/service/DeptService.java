package com.baizhi.service;

import java.util.List;

import com.baizhi.entity.Dept;

public interface DeptService {
	public void insert(Dept dept);
	public void delete(Dept dept);
	public void update(Dept dept);
	public List<Dept> queryAll();
}
