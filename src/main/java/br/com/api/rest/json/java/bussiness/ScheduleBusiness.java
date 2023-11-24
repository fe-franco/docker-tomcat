package br.com.api.rest.json.java.bussiness;

import java.util.List;

import br.com.api.rest.json.java.dao.ScheduleDAO;
import br.com.api.rest.json.java.interfaces.Business;
import br.com.api.rest.json.java.model.Schedule;

/**
 * 
 * @author Diovani Bernardi da Motta Data: 15/04/2016 Classe respons�vel por
 *         efetuar o encapsulamento da regra de neg�cio associada a entidade
 *         persitente
 */
public class ScheduleBusiness implements Business<Schedule> {

	private ScheduleDAO scheduleDAO = new ScheduleDAO();

	public void save(Schedule object) {
		scheduleDAO.save(object);
	}

	public void merge(Schedule object) {
		scheduleDAO.merge(object);
	}

	public void remove(Schedule object) {
		scheduleDAO.remove(object);
	}

	public List<Schedule> findAll() {
		return scheduleDAO.findAll();
	}

	public Schedule findByID(Long ID) {
		return scheduleDAO.findByID(ID);
	}

}
