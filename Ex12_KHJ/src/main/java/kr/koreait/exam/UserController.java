package kr.koreait.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService service;
	
	@PostMapping("/join")
	public int join(@RequestBody UserVO param) {
		return service.join(param);
	}
	
	@PostMapping("/login")
	public int login(@RequestBody UserVO param) {
		return service.login(param);
	}
}
