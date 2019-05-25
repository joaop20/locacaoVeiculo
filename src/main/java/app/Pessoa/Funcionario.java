/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.Pessoa;

import java.util.Date;

/**
 *
 * @author joao-
 */
public class Funcionario extends Pessoa {
    private double salario;
    private Date dataInicioJob;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getDataInicioJob() {
        return dataInicioJob;
    }

    public void setDataInicioJob(Date dataInicioJob) {
        this.dataInicioJob = dataInicioJob;
    }

    public Funcionario(double salario, Date dataInicioJob, String nome, String cpf, Date dataNascimento, String telefone, String endereco) {
        super(nome, cpf, dataNascimento, telefone, endereco);
        this.salario = salario;
        this.dataInicioJob = dataInicioJob;
    }
    
}
