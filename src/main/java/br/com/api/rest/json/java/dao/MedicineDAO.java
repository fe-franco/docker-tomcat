package br.com.api.rest.json.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.com.api.rest.json.java.data.DatabaseConnection;
import br.com.api.rest.json.java.model.Medicine;

public class MedicineDAO {

	public void save(Medicine object) {
		String sql = "INSERT INTO T_PLPL_MEDICAMENTO (nm_medicamento, ds_detalhada_medicamento, nr_codigo_barras, dt_cadastro, nm_usuario) VALUES (?, ?, ?, ?, ?)";

		try (Connection conn = DatabaseConnection.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {

			stmt.setString(1, object.getNmMedicamento());
			stmt.setString(2, object.getDsDetalhadaMedicamento());
			stmt.setString(3, object.getNrCodigoBarras());
			stmt.setString(4, object.getDtCadastro());
			stmt.setString(5, object.getNmUsuario());

			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void merge(Medicine object) {
		String sql = "UPDATE T_PLPL_MEDICAMENTO SET nm_medicamento = ?, ds_detalhada_medicamento = ?, nr_codigo_barras = ?, dt_cadastro = ?, nm_usuario = ? WHERE id = ?";

		try (Connection conn = DatabaseConnection.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {

			stmt.setString(1, object.getNmMedicamento());
			stmt.setString(2, object.getDsDetalhadaMedicamento());
			stmt.setString(3, object.getNrCodigoBarras());
			stmt.setString(4, object.getDtCadastro());
			stmt.setString(5, object.getNmUsuario());
			stmt.setInt(6, object.getIdMedicamento());

			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void remove(Medicine object) {
		String sql = "DELETE FROM T_PLPL_MEDICAMENTO WHERE id = ?";

		try (Connection conn = DatabaseConnection.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {

			stmt.setInt(1, object.getIdMedicamento());

			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Medicine> findAll() {
		List<Medicine> medicines = new ArrayList<>();
		String sql = "SELECT * FROM T_PLPL_MEDICAMENTO";

		try (Connection conn = DatabaseConnection.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql);
				ResultSet rs = stmt.executeQuery()) {

			while (rs.next()) {
				Medicine medicine = new Medicine(sql, sql, sql, sql, sql);
				medicines.add(medicine);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return medicines;
	}

	public Medicine findByID(int ID) {
		Optional<Medicine> medicine = Optional.empty();
		String sql = "SELECT * FROM T_PLPL_MEDICAMENTO WHERE id = ?";

		try (Connection conn = DatabaseConnection.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {

			stmt.setInt(1, ID);

			try (ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					medicine = Optional.of(new Medicine(sql, sql, sql, sql, sql));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return medicine.orElse(null);
	}

}