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
public class Lancha extends Veiculo {

    public Lancha(String cor, double capacidade, double potencia, double custo) {
        super(cor, capacidade, potencia, custo);
    }

    @Override
    public String getTipo() {
        return("Aquatico.");//To change body of generated methods, choose Tools | Templates.
    }
    
}
