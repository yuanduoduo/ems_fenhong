package com.baizhi.service;

import com.baizhi.dao.EmpDao;
import com.baizhi.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service("empService")
@Transactional
public class EmpServiceImpl implements EmpService{
	@Autowired
	private EmpDao empDao;
	
	public void insert(Emp emp) {
		
		empDao.insert(emp);
	}

	public void delete(Emp emp) {
		empDao.delete(emp);
	}

	public void update(Emp emp) {
		empDao.update(emp);
	}

	@Transactional(propagation = Propagation.SUPPORTS)
	public List<Emp> queryAll(String dept) {
		List<Emp> queryAll = empDao.queryAll(dept);
		return queryAll;
	}

}
