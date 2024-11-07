package DoAnLTWeb.services;

import java.util.List;

import DoAnLTWeb.entities.TableList;

public interface tableListServices {

	void deleteAll();

	void deleteAllById(Iterable<? extends Integer> ids);

	long count();

	List<TableList> findAll();

	<S extends TableList> S save(S entity);

}
