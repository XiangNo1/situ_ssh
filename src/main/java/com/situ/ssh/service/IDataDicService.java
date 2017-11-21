package com.situ.ssh.service;

import com.situ.ssh.pojo.Data_dic;
import com.situ.ssh.util.PageBean;

public interface IDataDicService {

	void pageQuery(PageBean pageBean);

	void addDataDic(Data_dic model);

	void updateDataDic(Data_dic model);

	void deleteDicService(String ids);

	Data_dic findById(Integer id);



	
}
