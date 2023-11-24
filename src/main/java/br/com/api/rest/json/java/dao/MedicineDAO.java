package br.com.api.rest.json.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.com.api.rest.json.java.data.DatabaseConnection;
import br.com.api.rest.json.java.interfaces.Persist;
import br.com.api.rest.json.java.model.Medicine;

public class MedicineDAO {

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
        List<Medicine> prestadores = new ArrayList<>();
        String sql = "SELECT * FROM T_PLPL_MEDICAMENTO";

        try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Medicine prestador = new Medicine(sql, sql, sql, sql);
                prestadores.add(prestador);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return prestadores;
    }

    @Override
    public Medicine findByID(Long ID) {
        Optional<Medicine> fornecedor = medicines.stream().filter(f -> f.getId().equals(ID)).findFirst();
        return fornecedor.get();
    }

}