package com.kaicom.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	Logger logger = LoggerFactory.getLogger(getClass());
	@RequestMapping("/login")
	public String login(@RequestParam("userName") String userName,@RequestParam("password") String password){
		String zs = new String(Base64Utils.decodeFromString(userName));
		String mm = new String(Base64Utils.decodeFromString(password));
		/*		String zs = new String(Md5.makeMD5("ab_*c/-dSAJu46>,<+-ef"));
		String mm = new String(Md5.makeMD5("44`4abc2uf5^def12,__+=-3"));*/
		logger.info("zs------------------------->"+zs);
		logger.info("userName------------------->"+userName);
		logger.info("mm------------------------->"+mm);
		logger.info("password------------------->"+password);
		return "success";
	}
}
