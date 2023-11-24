package br.com.api.rest.json.java.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.com.api.rest.json.java.interfaces.Persist;
import br.com.api.rest.json.java.model.Schedule;


public class ScheduleDAO implements Persist<Schedule> {

	private static List<Schedule> schedules = new ArrayList<Schedule>();

	@Override
	public void save(Schedule object) {
		schedules.add(object);
	}

	@Override
	public void merge(Schedule object) {
		schedules.add(object);
	}

	@Override
	public void remove(Schedule object) {
		schedules.remove(object);
	}

	@Override
	public List<Schedule> findAll() {
		return schedules;
	}

	@Override
	public Schedule findByID(Long ID) {
		Optional<Schedule> schedule = schedules.stream().filter(f -> f.getId().equals(ID)).findFirst();
		return schedule.get();
	}

}
