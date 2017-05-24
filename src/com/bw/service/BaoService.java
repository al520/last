package com.bw.service;

import java.util.List;

import com.bw.dto.Login;
import com.bw.dto.Yu;

public interface BaoService {

	List getlistall();

	void gettotigao(String[] id);

	List gettocha(Integer id);

	void gettojiang(String[] id);


	Login gettologin(Login login);

}
