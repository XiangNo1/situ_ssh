package com.situ.ssh.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionProxy;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class CheckLoginInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		ActionContext actionContext = invocation.getInvocationContext();
		ActionProxy proxy = invocation.getProxy();
		String methodName = proxy.getMethod();
		if ("login".equals(methodName)) {
			Object object = actionContext.getSession().get("admin");
			if (object == null) {
               return "login";
           } 
		}
		return invocation.invoke();
	}

	
}
