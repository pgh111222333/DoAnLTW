package DoAnLTWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import DoAnLTWeb.entities.User;

public interface userRepository extends JpaRepository<User, Integer>{
	User findByusername(String name);

}
