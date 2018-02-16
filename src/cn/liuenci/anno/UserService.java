package cn.liuenci.anno;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {
	/*@Autowired
	private UserDao userDao;*/
	
	@Resource(name="userDao")
	private UserDao userDao;
	
	public void add() {
		System.out.println("service");
		userDao.add();
	}
}
