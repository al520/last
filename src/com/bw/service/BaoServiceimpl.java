package com.bw.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.dto.Bao;
import com.bw.dto.Login;
import com.bw.dto.Yu;
import com.bw.mapper.BaoMapper;

@Service
public class BaoServiceimpl implements BaoService{
		@Autowired
		private BaoMapper baoMapper;

		@Override
		public List getlistall() {
			// TODO Auto-generated method stub
			return baoMapper.getlistall();
		}

		@Override
		public void gettotigao(String[] id) {
			// TODO Auto-generated method stub
			Yu yu=new Yu();
			Date time = new Date();
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String date = format.format(time);
			for (String ids : id) {
				Bao bao=baoMapper.gettocha(ids);
					if(bao.getJing().equals("蓝色"))
					{
						bao.setJing("黄色");
						baoMapper.gettotigao(bao);
						yu.setJing("蓝色升级为黄色");
						yu.setXian(bao.getXian());
						yu.setId(bao.getId());
						yu.setYdate(date);
						Boolean b=baoMapper.gettoaddd(yu);
					}
					else if(bao.getJing().equals("黄色"))
					{
						bao.setJing("橙色");
						baoMapper.gettotigao(bao);
						yu.setJing("黄色升级为橙色");
						yu.setXian(bao.getXian());
						yu.setId(bao.getId());
						yu.setYdate(date);
						Boolean b=baoMapper.gettoaddd(yu);
					}
					else if(bao.getJing().equals("橙色"))
					{
						bao.setJing("红色");
						baoMapper.gettotigao(bao);
						yu.setJing("橙色升级为红色");
						yu.setXian(bao.getXian());
						yu.setId(bao.getId());
						yu.setYdate(date);
						Boolean b=baoMapper.gettoaddd(yu);
					}
					else if(bao.getJing().equals("红色"))
					{
						bao.setJing("红色");
						baoMapper.gettotigao(bao);
						yu.setJing("红色");
						yu.setXian(bao.getXian());
						yu.setId(bao.getId());
						yu.setYdate(date);
						Boolean b=baoMapper.gettoaddd(yu);
					}
					else if(bao.getJing().equals("无预警"))
					{
						bao.setJing("蓝色");
						baoMapper.gettotigao(bao);
						yu.setJing("无预警升级为蓝色");
						yu.setXian(bao.getXian());
						yu.setId(bao.getId());
						yu.setYdate(date);
						Boolean b=baoMapper.gettoaddd(yu);
					}
					
				}
				
		}

		@Override
		public List gettocha(Integer id) {
			// TODO Auto-generated method stub
			List y=null;
			
				Bao bao=baoMapper.getcha(id);
				if(bao!=null)
				{
					y= baoMapper.gettoocha(bao.getXian());
					
				}
				
			
			return y;
			
		}

		@Override
		public void gettojiang(String[] id) {
			// TODO Auto-generated method stub
			Yu yu=new Yu();
			Date time = new Date();
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String date = format.format(time);
			for (String ids : id) {
				Bao bao=baoMapper.gettocha(ids);
					if(bao.getJing().equals("蓝色"))
					{
						bao.setJing("无预警");
						baoMapper.gettotigao(bao);
						yu.setJing("蓝色将为无预警");
						yu.setXian(bao.getXian());
						yu.setId(bao.getId());
						yu.setYdate(date);
						Boolean b=baoMapper.gettoaddd(yu);
					}
					else if(bao.getJing().equals("黄色"))
					{
						bao.setJing("蓝色");
						baoMapper.gettotigao(bao);
						yu.setJing("黄色将为蓝色");
						yu.setXian(bao.getXian());
						yu.setId(bao.getId());
						yu.setYdate(date);
						Boolean b=baoMapper.gettoaddd(yu);
					}
					else if(bao.getJing().equals("橙色"))
					{
						bao.setJing("黄色");
						baoMapper.gettotigao(bao);
						yu.setJing("橙色将为黄色");
						yu.setXian(bao.getXian());
						yu.setId(bao.getId());
						yu.setYdate(date);
						Boolean b=baoMapper.gettoaddd(yu);
					}
					else if(bao.getJing().equals("红色"))
					{
						bao.setJing("橙色");
						baoMapper.gettotigao(bao);
						yu.setJing("红色将为橙色");
						yu.setXian(bao.getXian());
						yu.setId(bao.getId());
						yu.setYdate(date);
						Boolean b=baoMapper.gettoaddd(yu);
					}
					else if(bao.getJing().equals("无预警"))
					{
						bao.setJing("无预警");
						baoMapper.gettotigao(bao);
						yu.setJing("取消预警");
						yu.setXian(bao.getXian());
						yu.setId(bao.getId());
						yu.setYdate(date);
						Boolean b=baoMapper.gettoaddd(yu);
					}
					
				}
		}

		@Override
		public Login gettologin(Login login) {
			// TODO Auto-generated method stub
			return baoMapper. gettologin(login);
		}
	
}
