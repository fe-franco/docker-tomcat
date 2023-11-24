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

import br.com.api.rest.json.java.bussiness.MedicineBusiness;
import br.com.api.rest.json.java.model.Medicine;

@Path("/medicine")
public class MedicineController {

	private MedicineBusiness medicineBusiness = new MedicineBusiness();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Medicine> findAll() {
		return medicineBusiness.findAll();
	}

	@GET
	@Path("{ID}")
	@Produces(MediaType.APPLICATION_JSON)
	public Medicine findByID(@PathParam("ID") int ID) {
		return medicineBusiness.findByID(ID);
	}

	@POST
	@Path("{ID}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void save(Medicine object) {
		medicineBusiness.save(object);
	}

	@PUT
	@Path("{ID}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void merge(Medicine object) {
		medicineBusiness.merge(object);
	}

	@DELETE
	@Path("{ID}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void remove(Medicine object) {
		medicineBusiness.remove(object);
	}
}
