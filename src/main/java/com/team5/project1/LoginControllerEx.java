package com.team5.project1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginControllerEx {

	@RequestMapping("/login")
	public void login() {
		System.out.println("로그인 되었습니다.");
	}
}
