package com.baizhi.controller;

import com.baizhi.entity.Dept;
import com.baizhi.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
@Controller
@RequestMapping("/dept")
public class DeptController {
	@Autowired
	private DeptService deptService;
	@RequestMapping("/insert")
	public String insert(Dept dept){
		deptService.insert(dept);
		return "redirect:/dept/queryAll";
	}
	@RequestMapping("/update")
	public String update(Dept dept){
		deptService.update(dept);
		return "redirect:/dept/queryAll";
	}
	@RequestMapping("/delete")
	public String delete(Dept dept){
		deptService.delete(dept);
		return "redirect:/dept/queryAll";
	}
	@RequestMapping("/queryAll")
	public String queryAll(HttpServletRequest request){
		List<Dept> queryAll = deptService.queryAll();
		System.out.println(queryAll);
		request.setAttribute("queryAll", queryAll);
		return "dept/deptlist";
	}
	
	
}
