package entities;

import java.util.List;

import java.util.Date;

public class Usuario extends Perfil{
    private int id;
    private boolean situacaoCadastral;
    private List<Emprestimo> historico;

    public Usuario(String nome, Date dataNascimento, String cpf, String email, String telefone, String endereco){
        super(nome, dataNascimento, cpf, email, telefone, endereco);
    }
}