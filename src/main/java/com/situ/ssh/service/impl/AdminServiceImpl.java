package com.situ.ssh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.situ.ssh.dao.IAdminDao;
import com.situ.ssh.pojo.Admin;
import com.situ.ssh.pojo.Data_dic;
import com.situ.ssh.service.IAdminService;
import com.situ.ssh.util.PageBean;

@Service
public class AdminServiceImpl implements IAdminService{
	@Autowired
	private IAdminDao adminDao;

	public Admin login(Admin admin) {
		// TODO Auto-generated method stub
		return (Admin) adminDao.login(admin);
	}

	@Override
	public void findAdmin(PageBean pageBean) {
		// TODO Auto-generated method stub
		adminDao.pageQuery(pageBean);
	}

	@Override
	public void addAdmin(Admin model) {
		// TODO Auto-generated method stub
		adminDao.save(model);
	}

	@Override
	public void updateAdmin(Admin model) {
		// TODO Auto-generated method stub
		adminDao.update(model);
	}

	@Override
	public void deleteAdmin(String ids) {
		// TODO Auto-generated method stub
		String[] idArray = ids.split(",");
		for (String id : idArray) {
			Admin admin = new Admin();
			admin.setId(Integer.parseInt(id));
			adminDao.delete(admin);
		}
	}

}