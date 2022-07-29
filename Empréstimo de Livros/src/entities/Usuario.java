package entities;

import java.util.Date;

public class Usuario extends Perfil{
    public static int geradorId = 1;
    
    private int id;
    private boolean situacaoCadastral;

    public Usuario(String nome, Date dataNascimento, String cpf, String email, String telefone, String endereco){
        super(nome, dataNascimento, cpf, email, telefone, endereco);
        this.situacaoCadastral = true;
        this.id = geradorId;
        geradorId ++;
    }

    public int getId() {
        return id;
    }

    public boolean isSituacaoCadastral() {
        return situacaoCadastral;
    }

    public void setSituacaoCadastral(boolean situacaoCadastral) {
        this.situacaoCadastral = situacaoCadastral;
    }  
}