package com.anderson.cadastro.dao;

import com.anderson.cadastro.domain.Cargo;

import java.util.List;

/**
 * Created by Anderson on 16/06/2019.
 */

// - H
public interface CargoDao {

    void save(Cargo cargo);

    void update(Cargo cargo);

    void delete(Long id);

    Cargo findById(Long id);

    List<Cargo> findAll();
}
