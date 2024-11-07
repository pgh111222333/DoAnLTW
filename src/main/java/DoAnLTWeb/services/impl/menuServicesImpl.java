package DoAnLTWeb.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DoAnLTWeb.entities.Menu;
import DoAnLTWeb.repository.itemRespository;
import DoAnLTWeb.services.menuServices;

@Service
public class menuServicesImpl implements menuServices{
	@Autowired 
	itemRespository menuRepo;

	public menuServicesImpl(itemRespository menuRepo) {
		this.menuRepo = menuRepo;
	}

	@Override
	public Menu findByitemName(String name) {
		return menuRepo.findByitemName(name);
	}

	@Override
	public <S extends Menu> S save(S entity) {
		return menuRepo.save(entity);
	}

	@Override
	public List<Menu> findAll() {
		return menuRepo.findAll();
	}

	@Override
	public Optional<Menu> findById(Integer id) {
		return menuRepo.findById(id);
	}

	@Override
	public long count() {
		return menuRepo.count();
	}

	@Override
	public void deleteById(Integer id) {
		menuRepo.deleteById(id);
	}
	
	

}
