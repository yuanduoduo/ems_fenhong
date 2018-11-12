package com.baizhi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.baizhi.dao.DeptDao;
import com.baizhi.entity.Dept;
@Service("deptService")
@Transactional
public class DeptServiceImpl implements DeptService{
	@Autowired
	private DeptDao deptDao;
	public void insert(Dept dept) {
		deptDao.insert(dept);
	}
	public void delete(Dept dept) {
		deptDao.delete(dept);
	}
	
	@Transactional(propagation = Propagation.SUPPORTS)
	public List<Dept> queryAll() {
		 List<Dept> queryAll = deptDao.queryAll();
		 return queryAll;
	}
	@Override
	public void update(Dept dept) {
		deptDao.update(dept);
	}

}
