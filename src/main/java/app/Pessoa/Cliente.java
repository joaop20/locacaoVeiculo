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
public class Cliente extends Pessoa {

    public Cliente(String nome, String cpf, Date dataNascimento, String telefone, String endereco) {
        super(nome, cpf, dataNascimento, telefone, endereco);
    }
    
}
