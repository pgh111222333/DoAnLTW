package DoAnLTWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import DoAnLTWeb.entities.Menu;

public interface itemRespository extends JpaRepository<Menu, Integer>{
	Menu findByitemName(String name);

}
