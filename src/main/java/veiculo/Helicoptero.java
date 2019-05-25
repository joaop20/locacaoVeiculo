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
public class Helicoptero extends Veiculo {

    public Helicoptero(String cor, double capacidade, double potencia, double custo) {
        super(cor, capacidade, potencia, custo);
    }

    @Override
    public String getTipo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
