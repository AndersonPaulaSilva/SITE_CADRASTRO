package com.anderson.cadastro.domain;

import javax.persistence.*;
import java.util.List;

// - C

/**
 * Created by Anderson on 26/05/2019.
 */

@Entity
@Table(name = "DEPARTAMENTOS")

public class Departamento extends AbstractEntity<Long> {

    @Column(name = "nome", nullable = false, unique = true, length = 60) // Se Column name for iguau ao nome do atributo, não é necessário informar.
    private String nome;


    //
    @OneToMany(mappedBy = "departamento")
    private List<Cargo>cargos;
    //

    public List<Cargo> getCargos() {
        return cargos;
    } // List de Java Util List

    public void setCargos(List<Cargo> cargos) {
        this.cargos = cargos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
