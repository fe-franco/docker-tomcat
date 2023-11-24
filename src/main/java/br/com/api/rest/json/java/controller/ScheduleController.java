package br.com.api.rest.json.java.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.api.rest.json.java.bussiness.ScheduleBusiness;
import br.com.api.rest.json.java.interfaces.Controller;
import br.com.api.rest.json.java.model.Schedule;

/**
 * 
 * @author Diovani Bernardi da Motta. Data: 15/04/2016 Classe respons�vel por
 *         interceptar e devolver respostas geradas pela API
 */
@Path("/schedule")
public class ScheduleController implements Controller<Schedule> {

	private ScheduleBusiness scheduleBusiness = new ScheduleBusiness();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Schedule> findAll() {
		return scheduleBusiness.findAll();
	}

	@GET
	@Path("{ID}")
	@Produces(MediaType.APPLICATION_JSON)
	public Schedule findByID(@PathParam("ID") Long ID) {
		return scheduleBusiness.findByID(ID);
	}

	@POST
	@Path("{ID}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void save(Schedule object) {
		scheduleBusiness.save(object);
	}

	@PUT
	@Path("{ID}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void merge(Schedule object) {
		scheduleBusiness.merge(object);
	}

	@DELETE
	@Path("{ID}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void remove(Schedule object) {
		scheduleBusiness.remove(object);
	}
}
