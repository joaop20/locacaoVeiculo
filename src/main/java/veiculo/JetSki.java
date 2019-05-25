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
public class JetSki extends Veiculo {

    public JetSki(String cor, double capacidade, double potencia, double custo) {
        super(cor, capacidade, potencia, custo);
    }

    @Override
    public String getTipo() {
        return("Aquático"); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
