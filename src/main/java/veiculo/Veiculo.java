/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veiculo;

/**
 *
 * @author joao-
 */
public abstract class Veiculo {
    protected String cor;
    protected double capacidade;
    protected double potencia;
    protected double custo;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }
    
    public abstract String getTipo();

    public Veiculo(String cor, double capacidade, double potencia, double custo) {
        this.cor = cor;
        this.capacidade = capacidade;
        this.potencia = potencia;
        this.custo = custo;
    }
    
}
