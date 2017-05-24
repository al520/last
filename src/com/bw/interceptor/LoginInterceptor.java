package com.bw.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.bw.dto.Login;

public class LoginInterceptor implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		// TODO Auto-generated method stub
		//��ȡ�����URL
		StringBuffer url=request.getRequestURL();
		if(url.indexOf("login.action")>=0){
			//��½�ύ
			return true;
		}
		
		HttpSession session= request.getSession();
		Login username =  (Login) session.getAttribute("login");
		if(username!=null)
		{
			return true;
		}
		//��ת��¼����
		request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request, response);
		return false;
	}

}
