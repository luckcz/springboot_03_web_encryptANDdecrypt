package com.kaicom.utils;

import org.springframework.util.Base64Utils;

public class Test {
	public static void main(String[] args) {
		String password = "qwertyuiop---+==__54637!@#$%^&*()/?.<.>,\\|";
		System.out.println(Base64Utils.encodeToString(password.getBytes()));
		System.out.println(Base64Utils.encodeToUrlSafeString(password.getBytes()));
		System.out.println(new String(Base64Utils.decodeFromString(Base64Utils.encodeToString(password.getBytes()))));
		System.out.println(new String(Base64Utils.decodeFromUrlSafeString(Base64Utils.encodeToUrlSafeString(password.getBytes()))));
	}
}
