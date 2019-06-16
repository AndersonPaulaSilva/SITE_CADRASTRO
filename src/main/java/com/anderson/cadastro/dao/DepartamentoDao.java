package com.anderson.cadastro.dao;

import com.anderson.cadastro.domain.Departamento;

import java.util.List;

/**
 * Created by Anderson on 16/06/2019.
 */

// - I
public interface DepartamentoDao {

    void save(Departamento departamento);

    void update(Departamento departamento);

    void delete(Long id);

    Departamento findById(Long id);

    List<Departamento> findAll();
}
