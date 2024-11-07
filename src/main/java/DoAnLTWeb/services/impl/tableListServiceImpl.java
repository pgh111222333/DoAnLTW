package DoAnLTWeb.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DoAnLTWeb.entities.TableList;
import DoAnLTWeb.repository.tableRespository;
import DoAnLTWeb.services.tableListServices;

@Service
public class tableListServiceImpl implements tableListServices{
	@Autowired
	tableRespository tableRepo;

	public tableListServiceImpl(tableRespository tableRepo) {
		this.tableRepo = tableRepo;
	}

	@Override
	public <S extends TableList> S save(S entity) {
		return tableRepo.save(entity);
	}

	@Override
	public List<TableList> findAll() {
		return tableRepo.findAll();
	}

	@Override
	public long count() {
		return tableRepo.count();
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		tableRepo.deleteAllById(ids);
	}

	@Override
	public void deleteAll() {
		tableRepo.deleteAll();
	}
	
}
