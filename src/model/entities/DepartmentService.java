package model.entities;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;

public class DepartmentService {
	
	private DepartmentDao dao = DaoFactory.createDepartmentDao();
	
	public List<Department> findAll() {
		return dao.findAll();			
	}

	public void saveOrUpDate(Department obj) {
		if (obj.getId() == null) {
			dao.insert(obj);
		}
		else {
			dao.update(obj);
		}
			
	}
}
