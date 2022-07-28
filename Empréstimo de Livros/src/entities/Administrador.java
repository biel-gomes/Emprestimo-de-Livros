package entities;

import java.util.Date;

public class Administrador extends Perfil{
    private int id;
    
    public Administrador(String nome, Date dataNascimento, String cpf, String email, String telefone, String endereco) {
        super(nome, dataNascimento, cpf, email, telefone, endereco);
    }    
}
