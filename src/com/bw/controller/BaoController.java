package com.bw.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bw.dto.Login;
import com.bw.dto.Yu;
import com.bw.service.BaoService;

@Controller
public class BaoController {

	@Autowired
	private BaoService baoService;
	@RequestMapping(value="list")
	public String list(HttpServletRequest request) {
		// TODO Auto-generated method stub
		List list=baoService.getlistall();
		request.setAttribute("list", list);
		return "list";
	}
	@RequestMapping(value="totigao")
	public String totigao(HttpServletRequest request,String[] id) {
		// TODO Auto-generated method stub
		baoService.gettotigao(id);
		return "redirect:/list";
	}
	@RequestMapping(value="tocha")
	public String tocha(HttpServletRequest request,Integer id) {
		// TODO Auto-generated method stub
		List list=baoService.gettocha(id);
		request.setAttribute("list", list);
		return "cha";
	}
	@RequestMapping(value="jiang")
	public String jiang(HttpServletRequest request,String[] id) {
		// TODO Auto-generated method stub
		baoService.gettojiang(id);
		return "redirect:/list";
	}
	
	
	@RequestMapping(value="login")
	public String login(HttpSession session,Login login) {
		// TODO Auto-generated method stub
		Login logi=baoService.gettologin(login);
		session.setAttribute("login", logi);
		return "redirect:/list";
	}
	@RequestMapping(value="loginout")
	public String loginout(HttpSession session,String username, String password) {
		// TODO Auto-generated method stub
		//Çå³ýsession
		session.invalidate();    
		return "redirect:/list";
	}
}
