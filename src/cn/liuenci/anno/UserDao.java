package cn.liuenci.anno;

import org.springframework.stereotype.Component;

@Component("userDao")
public class UserDao {

	public void add() {
		System.out.println("dao");
	}
}
