package com.situ.ssh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.situ.ssh.dao.IEmployeeDao;
import com.situ.ssh.pojo.Employee;
import com.situ.ssh.pojo.Employee;
import com.situ.ssh.service.IEmployeeService;
import com.situ.ssh.util.PageBean;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeDao employeeDao;
	@Override
	public void findAll(PageBean pageBean) {
		// TODO Auto-generated method stub
		employeeDao.pageQuery(pageBean);
	}
	@Override
	public void addEmployee(Employee model) {
		// TODO Auto-generated method stub
		employeeDao.save(model);
	}
	@Override
	public void updateEmployee(Employee model) {
		// TODO Auto-generated method stub
		employeeDao.update(model);
	}
	@Override
	public void deleteEmployee(String ids) {
		// TODO Auto-generated method stub
		String[] idArray = ids.split(",");
		for (String id : idArray) {
			Employee employee = new Employee();
			employee.setId(Integer.parseInt(id));
			employeeDao.delete(employee);
		}
	}

}
