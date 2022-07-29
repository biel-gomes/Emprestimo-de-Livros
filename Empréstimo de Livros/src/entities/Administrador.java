package entities;

import java.util.Date;

public class Administrador extends Perfil{
    public static int geraId = 1;
    
    private int idAdministrador;
    
    public Administrador(String nome, Date dataNascimento, String cpf, String email, String telefone, String endereco) {
        super(nome, dataNascimento, cpf, email, telefone, endereco);
        this.idAdministrador = geraId;
        geraId ++;
    }

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

}
