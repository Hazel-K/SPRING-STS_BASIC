package kr.koreait.exam;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("UserVO")
public class UserVO {
	private int i_user;
	private String uid;
	private String upw;
	private String nm;
	private String r_datetime;
}