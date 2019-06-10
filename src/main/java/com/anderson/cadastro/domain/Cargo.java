package com.anderson.cadastro.domain;

import javax.persistence.*;
import java.util.List;


// - B

/**
 * Created by Anderson on 26/05/2019.
 */
@Entity
@Table(name = "CARGOS")
public class Cargo extends AbstractEntity<Long> {

    @Column(name = "nome", nullable = false, unique = true, length = 60)
    private String nome;

    @ManyToOne // Um departamento para muitos cargos.
    @JoinColumn(name = "id_departamento_fk") // Nome da chave estrangeira na tabela cargos
    private Departamento departamento;


    // Mapeamento com funcionarios

    @OneToMany(mappedBy = "cargo")
    private List<Funcionario> funcionarios;

    //


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
}
