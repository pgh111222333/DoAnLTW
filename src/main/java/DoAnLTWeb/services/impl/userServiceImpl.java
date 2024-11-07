package DoAnLTWeb.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import DoAnLTWeb.entities.User;
import DoAnLTWeb.repository.userRepository;
import DoAnLTWeb.services.userServices;

@Service
public class userServiceImpl  implements userServices{
	
	@Autowired
	userRepository userRepo;

	public userServiceImpl(userRepository userRepo) {
		this.userRepo = userRepo;
	}

	@Override
	public User findByusername(String name) {
		return userRepo.findByusername(name);
	}

	@Override
	public <S extends User> S save(S entity) {
		return userRepo.save(entity);
	}
	

}
