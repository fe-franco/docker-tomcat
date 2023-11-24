package br.com.api.rest.json.java.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Medicine implements Serializable {

	private static final long serialVersionUID = 6265729338971780551L;
	private int idMedicamento;
	private String nmMedicamento;
	private String dsDetalhadaMedicamento;
	private String nrCodigoBarras;
	private String dtCadastro;
	private String nmUsuario;

	public Medicine() {
		super();
	}

	public Medicine(String nmMedicamento, String dsDetalhadaMedicamento, String nrCodigoBarras,
			String dtCadastro, String nmUsuario) {
		super();
		this.nmMedicamento = nmMedicamento;
		this.dsDetalhadaMedicamento = dsDetalhadaMedicamento;
		this.nrCodigoBarras = nrCodigoBarras;
		this.dtCadastro = dtCadastro;
		this.nmUsuario = nmUsuario;
	}

	public int getIdMedicamento() {
		return idMedicamento;
	}

	public void setIdMedicamento(int idMedicamento) {
		this.idMedicamento = idMedicamento;
	}

	public String getNmMedicamento() {
		return nmMedicamento;
	}

	public void setNmMedicamento(String nmMedicamento) {
		this.nmMedicamento = nmMedicamento;
	}

	public String getDsDetalhadaMedicamento() {
		return dsDetalhadaMedicamento;
	}

	public void setDsDetalhadaMedicamento(String dsDetalhadaMedicamento) {
		this.dsDetalhadaMedicamento = dsDetalhadaMedicamento;
	}

	public String getNrCodigoBarras() {
		return nrCodigoBarras;
	}

	public void setNrCodigoBarras(String nrCodigoBarras) {
		this.nrCodigoBarras = nrCodigoBarras;
	}

	public String getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(String dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	public String getNmUsuario() {
		return nmUsuario;
	}

	public void setNmUsuario(String nmUsuario) {
		this.nmUsuario = nmUsuario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (idMedicamento ^ (idMedicamento >>> 32));
		result = prime * result + ((nmMedicamento == null) ? 0 : nmMedicamento.hashCode());
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
		Medicine other = (Medicine) obj;
		if (idMedicamento != other.idMedicamento)
			return false;
		if (nmMedicamento == null) {
			if (other.nmMedicamento != null)
				return false;
		} else if (!nmMedicamento.equals(other.nmMedicamento))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Medicine [idMedicamento=" + idMedicamento + ", nmMedicamento=" + nmMedicamento + "]";
	}
}
