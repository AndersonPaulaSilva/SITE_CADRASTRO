package com.anderson.cadastro.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

// - F

/**
 * Created by Anderson on 02/06/2019.
 */

@Entity
@Table(name = "FUNCIONARIOS")
public class Funcionario extends AbstractEntity<Long> {

    @Column(nullable = false, unique = true) // Não nulo e único
    private String nome;

    @Column(nullable = false, columnDefinition = "DECIMAL(7,2) DEFAULT 0.00") // columnDefinition = como estará no BD
    private BigDecimal salario;


    @Column(name = "data_entrada", nullable = false, columnDefinition = "DATE")
    private LocalDate dataEntrada;

    @Column(name = "data_saida", nullable = true, columnDefinition = "DATE")
    private LocalDate dataSaida;


    @OneToOne(cascade = CascadeType.ALL) // um para um com endereco.
    @JoinColumn(name = "endereco_id_fk") // nome da chave esterangeira de endereco na tabela FUNCIONARIOS
    private Endereco endereco;


    @ManyToOne // muitos para um com cargo
    @JoinColumn(name = "cargo_id_fk")
    private Cargo cargo;

    // get set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
