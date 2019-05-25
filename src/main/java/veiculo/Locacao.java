/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veiculo;

import app.Pessoa.Cliente;
import app.Pessoa.Funcionario;
import java.util.Date;

/**
 *
 * @author joao-
 */
public class Locacao  {
    
    private Cliente cliente;
    private Funcionario funcionario;
    private Veiculo veiculo;
    double precoLocacao;
    int diaria;
    Date dataInicio;
    Date dataFinal;
    Date dataEntregue;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public double getPrecoLocacao() {
        return precoLocacao;
    }

    public void setPrecoLocacao(double precoLocacao) {
        this.precoLocacao = precoLocacao;
    }

    public int getDiaria() {
        return diaria;
    }

    public void setDiaria(int diaria) {
        this.diaria = diaria;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Date getDataEntregue() {
        return dataEntregue;
    }

    public void setDataEntregue(Date dataEntregue) {
        this.dataEntregue = dataEntregue;
    }

    public Locacao(Cliente cliente, Funcionario funcionario, Veiculo veiculo, double precoLocacao, int diaria, Date dataInicio, Date dataFinal, Date dataEntregue) {
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.veiculo = veiculo;
        this.precoLocacao = precoLocacao;
        this.diaria = diaria;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.dataEntregue = dataEntregue;
    }
    
}