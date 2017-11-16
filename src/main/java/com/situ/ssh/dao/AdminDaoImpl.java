package com.situ.ssh.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.situ.ssh.dao.IAdminDao;
import com.situ.ssh.dao.base.BaseDaoImpl;
import com.situ.ssh.pojo.Admin;


@Repository
public class AdminDaoImpl extends BaseDaoImpl<Admin> implements IAdminDao {

	@Override
	public Admin login(Admin admin) {
		System.out.println(admin);
		System.out.println("AdminDaoImpl.login()");
		String hql = "FROM Admin a WHERE a.name = ? AND a.password = ?";
		//List<Admin> list = (List<Admin>) this.getHibernateTemplate().find(hql);
		List<Admin> list = (List<Admin>) this.getHibernateTemplate().find(hql, admin.getName(), admin.getPassword());
		System.out.println(list);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;

	}

}