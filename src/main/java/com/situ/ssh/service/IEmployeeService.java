package com.situ.ssh.service;

import com.situ.ssh.pojo.Employee;
import com.situ.ssh.util.PageBean;

public interface IEmployeeService {

	void findAll(PageBean pageBean);

	void addEmployee(Employee model);

	void updateEmployee(Employee model);

	void deleteEmployee(String ids);

}
