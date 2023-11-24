package br.com.api.rest.json.java.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Schedule implements Serializable {

	private static final long serialVersionUID = 6265729338971780551L;
	private Long id;
	private Medicine medicine;
	private String time;
	private String frequency;

	public Schedule() {
		super();
	}

	public Schedule(Long id, Medicine medicine, String time, String frequency) {
		super();
		this.id = id;
		this.medicine = medicine;
		this.time = time;
		this.frequency = frequency;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Medicine getMedicine() {
		return medicine;
	}

	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((medicine == null) ? 0 : medicine.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Schedule other = (Schedule) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (medicine == null) {
			if (other.medicine != null)
				return false;
		} else if (!medicine.equals(other.medicine))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Schedule [id=" + id + ", medicine=" + medicine + ", time=" + time + ", frequency=" + frequency + "]";
	}
}
