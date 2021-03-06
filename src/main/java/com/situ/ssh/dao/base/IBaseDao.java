package com.situ.ssh.dao.base;

import java.io.Serializable;
import java.util.List;

import com.situ.ssh.pojo.Data_dic;
import com.situ.ssh.util.PageBean;

public interface IBaseDao<T> {
	public void save(T entity);
	public void delete(T entity);
	public void update(T entity);
	public T findById(Serializable id);
	public List<T> findAll();
	public void pageQuery(PageBean pageBean);
}