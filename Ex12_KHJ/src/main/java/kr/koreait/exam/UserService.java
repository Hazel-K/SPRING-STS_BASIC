package kr.koreait.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserMapper mapper;
	
	public int join(UserVO param) {
		return mapper.join(param);
	}
	
	// 1번 로그인 성공, 2번 비번 틀림, 3번 아이디 없음
	public int login(UserVO param) {
		UserVO selUser = mapper.getUser(param);
		if(selUser == null) { return 3; }
		return !param.getUpw().equals(selUser.getUpw()) ? 2 : 1;
	}
}