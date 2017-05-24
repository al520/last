package com.bw.mapper;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.bw.dto.Bao;
import com.bw.dto.Login;
import com.bw.dto.Yu;

public interface BaoMapper {

	List getlistall();

	Bao gettocha(String ids);

	void gettotigao(Bao bao);

	Boolean gettoaddd(Yu yu);

	Bao getcha(Integer id);

	List gettoocha(String xian);

	Login gettologin(Login login);

	

}
