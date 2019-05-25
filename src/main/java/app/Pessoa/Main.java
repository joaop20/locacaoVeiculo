/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.Pessoa;

import veiculo.Moto;
import veiculo.Veiculo;

/**
 *
 * @author joao-
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Veiculo v = new Moto("", 10, 10, 10);
        System.out.println(v.getTipo());
    }
    
}
