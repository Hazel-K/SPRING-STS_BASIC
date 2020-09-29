package kr.koreait.exam;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
	int join(UserVO vo);
	UserVO getUser(UserVO vo);
}
