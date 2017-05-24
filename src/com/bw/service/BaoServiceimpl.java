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
					if(bao.getJing().equals("��ɫ"))
					{
						bao.setJing("��ɫ");
						baoMapper.gettotigao(bao);
						yu.setJing("��ɫ����Ϊ��ɫ");
						yu.setXian(bao.getXian());
						yu.setId(bao.getId());
						yu.setYdate(date);
						Boolean b=baoMapper.gettoaddd(yu);
					}
					else if(bao.getJing().equals("��ɫ"))
					{
						bao.setJing("��ɫ");
						baoMapper.gettotigao(bao);
						yu.setJing("��ɫ����Ϊ��ɫ");
						yu.setXian(bao.getXian());
						yu.setId(bao.getId());
						yu.setYdate(date);
						Boolean b=baoMapper.gettoaddd(yu);
					}
					else if(bao.getJing().equals("��ɫ"))
					{
						bao.setJing("��ɫ");
						baoMapper.gettotigao(bao);
						yu.setJing("��ɫ����Ϊ��ɫ");
						yu.setXian(bao.getXian());
						yu.setId(bao.getId());
						yu.setYdate(date);
						Boolean b=baoMapper.gettoaddd(yu);
					}
					else if(bao.getJing().equals("��ɫ"))
					{
						bao.setJing("��ɫ");
						baoMapper.gettotigao(bao);
						yu.setJing("��ɫ");
						yu.setXian(bao.getXian());
						yu.setId(bao.getId());
						yu.setYdate(date);
						Boolean b=baoMapper.gettoaddd(yu);
					}
					else if(bao.getJing().equals("��Ԥ��"))
					{
						bao.setJing("��ɫ");
						baoMapper.gettotigao(bao);
						yu.setJing("��Ԥ������Ϊ��ɫ");
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
					if(bao.getJing().equals("��ɫ"))
					{
						bao.setJing("��Ԥ��");
						baoMapper.gettotigao(bao);
						yu.setJing("��ɫ��Ϊ��Ԥ��");
						yu.setXian(bao.getXian());
						yu.setId(bao.getId());
						yu.setYdate(date);
						Boolean b=baoMapper.gettoaddd(yu);
					}
					else if(bao.getJing().equals("��ɫ"))
					{
						bao.setJing("��ɫ");
						baoMapper.gettotigao(bao);
						yu.setJing("��ɫ��Ϊ��ɫ");
						yu.setXian(bao.getXian());
						yu.setId(bao.getId());
						yu.setYdate(date);
						Boolean b=baoMapper.gettoaddd(yu);
					}
					else if(bao.getJing().equals("��ɫ"))
					{
						bao.setJing("��ɫ");
						baoMapper.gettotigao(bao);
						yu.setJing("��ɫ��Ϊ��ɫ");
						yu.setXian(bao.getXian());
						yu.setId(bao.getId());
						yu.setYdate(date);
						Boolean b=baoMapper.gettoaddd(yu);
					}
					else if(bao.getJing().equals("��ɫ"))
					{
						bao.setJing("��ɫ");
						baoMapper.gettotigao(bao);
						yu.setJing("��ɫ��Ϊ��ɫ");
						yu.setXian(bao.getXian());
						yu.setId(bao.getId());
						yu.setYdate(date);
						Boolean b=baoMapper.gettoaddd(yu);
					}
					else if(bao.getJing().equals("��Ԥ��"))
					{
						bao.setJing("��Ԥ��");
						baoMapper.gettotigao(bao);
						yu.setJing("ȡ��Ԥ��");
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
