package br.com.api.rest.json.java.bussiness;

import java.util.List;

import br.com.api.rest.json.java.dao.MedicineDAO;
import br.com.api.rest.json.java.interfaces.Business;
import br.com.api.rest.json.java.model.Medicine;

public class MedicineBusiness implements Business<Medicine> {

	private MedicineDAO medicineDAO = new MedicineDAO();

	public void save(Medicine object) {
		medicineDAO.save(object);
	}

	public void merge(Medicine object) {
		medicineDAO.merge(object);
	}

	public void remove(Medicine object) {
		medicineDAO.remove(object);
	}

	public List<Medicine> findAll() {
		return medicineDAO.findAll();
	}

	public Medicine findByID(Long ID) {
		return medicineDAO.findByID(ID);
	}

}
