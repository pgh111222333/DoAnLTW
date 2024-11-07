package DoAnLTWeb.services;

import java.util.List;
import java.util.Optional;

import DoAnLTWeb.entities.Menu;

public interface menuServices {

	void deleteById(Integer id);

	long count();

	Optional<Menu> findById(Integer id);

	List<Menu> findAll();

	<S extends Menu> S save(S entity);

	Menu findByitemName(String name);

}
