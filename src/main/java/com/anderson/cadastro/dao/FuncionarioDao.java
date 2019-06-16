package com.anderson.cadastro.dao;

import com.anderson.cadastro.domain.Funcionario;

import java.util.List;

/**
 * Created by Anderson on 16/06/2019.
 */
// - J
public interface FuncionarioDao {

    void save(Funcionario funcionario);

    void update(Funcionario funcionario);

    void delete(Long id);

    Funcionario findById(Long id);

    List<Funcionario> findAll();
}
