package br.com.api.rest.json.java.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.com.api.rest.json.java.interfaces.Persist;
import br.com.api.rest.json.java.model.Medicine;

public class MedicineDAO implements Persist<Medicine> {

	private static List<Medicine> medicines = new ArrayList<Medicine>();

	static {
		/* Create Medicine objects */
		Medicine m1 = new Medicine(1L, "Paracetamol");
		Medicine m2 = new Medicine(2L, "Aspirin");
		Medicine m3 = new Medicine(3L, "Ibuprofen");
		Medicine m4 = new Medicine(4L, "Amoxicillin");
		Medicine m5 = new Medicine(5L, "Loratadine");
		Medicine m6 = new Medicine(6L, "Omeprazole");

		/* Adiciono a lista */
		medicines.add(m1);
		medicines.add(m2);
		medicines.add(m3);
		medicines.add(m4);
		medicines.add(m5);
		medicines.add(m6);
	}

	@Override
	public void save(Medicine object) {
		medicines.add(object);
	}

	@Override
	public void merge(Medicine object) {
		medicines.add(object);
	}

	@Override
	public void remove(Medicine object) {
		medicines.remove(object);
	}

	@Override
	public List<Medicine> findAll() {
		return medicines;
	}

	@Override
	public Medicine findByID(Long ID) {
		Optional<Medicine> fornecedor = medicines.stream().filter(f -> f.getId().equals(ID)).findFirst();
		return fornecedor.get();
	}

}
