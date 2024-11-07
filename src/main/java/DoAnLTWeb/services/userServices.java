package DoAnLTWeb.services;

import DoAnLTWeb.entities.User;

public interface userServices {

	User findByusername(String name);

	<S extends User> S save(S entity);
	
}
